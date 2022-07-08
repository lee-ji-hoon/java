import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StringRegex {

    private static final String msg = "Hello World Java Regex Hello";
    @Test
    @DisplayName("String 에서 지원하는 Regex")
    void ex1() {
        // a가 0~N번 반복 + 0~9가 0~N번 반복
        String pattern = "a*[0-9]*";
        assertTrue("aa1".matches(pattern));

        // 공백 1칸 +붙으면 여러칸
        String pattern2 = "\\s";
        System.out.println(Arrays.toString(msg.split(pattern2))); // 공백을 기준으로 자르기
        // [Hello, World, Java, Regex, Hello]

        // 문자열 첫번째가 Hello면 hi로 변경
        System.out.println(msg.replaceFirst("Hello", "hi")); // hi World Java Regex Hello
        // 문자열중에서 Hello가 있으면 hi로 변경
        System.out.println(msg.replaceAll("Hello", "hi")); // hi World Java Regex hi
    }
}
