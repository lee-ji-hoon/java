package 자바의정석.ch8;

public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("ae.getMessage() = " + ae.getMessage());
            /*
            java.lang.ArithmeticException: / by zero
            at 자바의정석.ch8.Ex8_5.main(Ex8_5.java:10)
            ae.getMessage() = / by zero
            */
        }
        System.out.println(5);
    }
}
