package 자바의정석.ch8;

public class Ex8_7 {
    public static void main(String[] args) {
        // Unhandled exception: java.lang.Exception
        // 예외처리가 필수이다. 컴파일 과정에서 에러 (checked 예외)
//        throw new Exception();
        try {
            // 예외 처리 안할 경우 (unckecked 예외)
            // Exception in thread "main" java.lang.RuntimeException
            throw new RuntimeException();
        } catch (RuntimeException e) {
        }
    }
}
