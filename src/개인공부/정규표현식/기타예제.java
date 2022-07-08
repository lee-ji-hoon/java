import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class 기타예제 {

    private static final String msg1 = "The cat sat on the mat";
    private static final String msg2 = "hello world world";

    @Test
    @DisplayName("Backrefernces를 이용한 패턴")
    void ex1() {
        // c + 문자열 2개
        // s\\1 -> 공백(..)
        Pattern pattern = Pattern.compile("c(..) s\\1");
        Matcher matcher1 = pattern.matcher(msg1);
        Matcher matcher2 = pattern.matcher(msg2);
        assertTrue(matcher1.find());
        assertFalse(matcher2.find());
    }

    @Test
    @DisplayName("중복되는 단어 패턴 찾기")
    void ex2() {
        // 공백 + 문자 + 공백여러개 + 문자(\\w+) + 공백
        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
        Matcher matcher = pattern.matcher(msg2);
        assertTrue(matcher.find());
    }
}
