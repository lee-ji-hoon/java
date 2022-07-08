import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Quantifiers {
    @Test
    @DisplayName("*과 +를 이용한 정규식")
    void ex1() {
        // a가 반복(0번 가능) + 0~9사이의 숫자가 반복(0번 가능)
        String pattern = "a*[0-9]*";
        assertTrue("aaa123".matches(pattern)); // a가 3번 숫자가 3번 반복 true
        assertTrue("aaaa".matches((pattern))); // a가 4번 숫자가 0번 반복 true
        assertTrue("12213".matches(pattern)); // a가 0번 숫자가 4번 반복 true
        assertFalse("b123".matches(pattern)); // a가 아닌 b가 들어오므로 false

        // a가 반복(0번 가능) + 0~9사이의 숫자가 반복(최소 1번)
        String pattern2 = "a*[0-9]+";
        assertFalse("aaaa".matches(pattern2)); // a가 4번 반복 숫자가 0번 반복 false
        assertTrue("aaa123".matches(pattern)); // a가 3번 반복 숫자가 3번 반복 true
        assertTrue("123".matches(pattern2)); // a가 0번 반복 숫자가 3번 반복 true
    }

    @Test
    @DisplayName("?와 {X, Y}를 이용한 정규식")
    void ex2() {
        // a가 0~N번 반복 + 0~9가 0~1번 반복
        String pattern = "a*[0-9]?";
        assertTrue("aaa1".matches(pattern));
        assertFalse("aaa2323".matches(pattern));

        // a가 0~N번 반복 + 0~9가 0~3번 반복
        String pattern2 = "a*[0-9]{0,3}";
        assertTrue("aaa999".matches(pattern2));
        assertFalse("99999".matches(pattern2));

        // 번외편 010-xxxx-xxxx 휴대폰 번호 정규식 만들어보기
        String phoneNumber = "01[01]-\\d{3,4}-\\d{3,4}";
        assertTrue("010-1234-1234".matches(phoneNumber));
        assertFalse("010-11-112".matches(phoneNumber));
    }
}
