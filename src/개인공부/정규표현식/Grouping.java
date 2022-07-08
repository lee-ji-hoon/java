import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class Grouping {
    @Test
    @DisplayName("Grouping을 이용한 정규식")
    void ex1() {
        String msg = "Hello   World";
        // (문자)(공백 여러칸)(문자)
        String pattern = "(\\w)(\\s+)([\\w])";
        System.out.println(msg.replaceAll(pattern, "-")); // Hell-orld
        // $1 = o + $2 = 공백  + $3 = W
        System.out.println(msg.replaceAll(pattern, "$1-$3")); // Hello-World
    }
}
