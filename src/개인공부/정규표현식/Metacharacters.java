import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Metacharacters {
    private static final String msg = "The cat sat on the mat. and cat";
    private static final String msg2 = "This island is beautiful";

    @Test
    @DisplayName("문자열 치환 - 공백과 .")
    void ex1() {
        // ab + "문자열 암궈나 1개"
        String pattern = "ab.";
        assertFalse("ab".matches(pattern));
        assertTrue("abc".matches(pattern));

        // ab + \\s(공백) + \\S(공백을 제외한 문자)
        pattern = "ab\\s\\S";
        assertFalse("ab  ".matches(pattern));
        assertTrue("ab c".matches(pattern));
    }

    @Test
    @DisplayName("문자열 처음에 The나 the로 시작하는 경우만 *로 치환")
    void ex2() {
        String result;
        // [Tt] T나 t로 시작하는지 + he
        // 합치면 T나 t로 시작하면서 그 다음 문자열이 he이면 *로 변환시켜라!
        result = msg.replaceAll("[Tt]he", "*");
        System.out.println(result);

        // ^ ~ 로 시작하는지 [Tt] T나 t 둘 중 하나
        // 문자열 시작이 T나 t로 시작한다면 *로 변환시켜라!
        result = msg.replaceAll("^[Tt]he", "*");
        System.out.println(result);
        /* 출력 결과
         * cat sat on * mat and cat.
         * cat sat on th mat and cat.
         */
    }

    @Test
    @DisplayName("문자열 끝에 있는 cat만 *로 치환하기")
    void ex3() {
        // 문자열 끝이 cat 인지
        String regex1 = "cat$";
        // 문자열안에 cat이 있는지
        String regex2 = "cat";

        // 문자열 중에 cat은 2번 존재하지만 마지막만 확인하기 때문에 마지막만 *로 치환
        System.out.println(msg.replaceAll(regex1, "*")); // The cat sat on the mat. and *
        // 문자열 중에 cat은 2번 존재한다. 그러므로 둘 다 *로 치환
        System.out.println(msg.replaceAll(regex2, "*")); // The * sat on the mat. and *
    }

    @Test
    @DisplayName("독립적인 is 만 *로 치환하기")
    void ex4() {
        // is 단어 찾기
        String regex1 = "is";
        // 다른 문자와 결합되지 않은 is 찾기
        String regex2 = "\\bis\\b";

        // 의도치 않게 This와 island의 is까지 *로 치환되는 것을 볼 수 있다.
        System.out.println(msg2.replaceAll(regex1, "*")); // Th* *land * beautiful
        System.out.println(msg2.replaceAll(regex2, "*")); // This island * beautiful
    }

    @Test
    @DisplayName("[ ] 내부의 문자열 일치하는 것 찾기 '-' 도 사용")
    void ex5() {
        // 문자열의 처음이 abc 중의 하나
        // 두번째가 v z 중의 하나
        String pattern = "[abc][vz]";
        assertTrue("av".matches(pattern));
        assertFalse("abww".matches(pattern));

        // 문자열의 처음이 1~9사이 하나
        // 두번째가 a-z 소문자 중 하나
        String pattern2 = "[1-9][a-z]";
        assertTrue("1a".matches(pattern2));
        assertFalse("1A".matches(pattern2));
    }

    @Test
    @DisplayName("\\ 숫자 문자 공백 테스트")
    void ex6() {
        // \\d -> [0-9]와 동일
        // \\D -> 숫자가 아닌 문자 즉 [^0-9]와 동일
        // 합치면 첫 문자는 숫자 0~9사이 그리고 두 번째 문자는 숫자가 아닌 문자(공백 포함)
        String pattern = "\\d\\D";
        assertTrue("1a".matches(pattern));
        assertTrue("1 ".matches(pattern));
        assertFalse("11".matches(pattern));

        // \\d -> [0-9]
        // \\s -> 공백1칸
        // \\D -> 숫자가 아닌 문자
        // 0~9 + 공백 + 숫자가 아닌 문자
        String pattern2 = "\\d\\s\\D";
        assertTrue("1 a".matches(pattern2));

        // \\d -> [0-9]
        // \\s -> 공백1칸
        // \\S -> 공백이 아닌 문자
        // \\D -> 숫자가 아닌 문자
        // 0~9 + 공백 + 공백x + 숫자x
        String pattern3 = "\\d\\s\\S\\D";
        assertTrue("1 AA".matches(pattern3));

        // \\w -> Aplhanumeric(알파벳, 숫자) 문자 즉 [a-zA-Z_0-9]와 동일
        // \\W -> Aplhanumeric을 제외한 문자(공백 특수문자 등)
        // 알파벳 혹은 숫자 + 공백 혹은 특수문자 등
        String pattern4 = "\\w\\W";
        assertTrue("1 ".matches(pattern4));
        assertTrue("1*".matches(pattern4));
    }
}
