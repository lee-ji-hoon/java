import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    @Test
    @DisplayName("Pattern과 Matcher 사용해서 정규식 만들기")
    void ex1() {
        // 공백 + cat + 공백
        Pattern p = Pattern.compile("\\bcat\\b");
        Matcher m = p.matcher("cat cat cat cat123 cat cat");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match Number : " + count);
            System.out.println("group() : " + m.group());
            System.out.println("start() : " + m.start());
            System.out.println("end() : " + m.end());

        }
    }
}
