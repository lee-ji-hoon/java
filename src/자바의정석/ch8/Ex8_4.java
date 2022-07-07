package 자바의정석.ch8;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae){
            if(ae instanceof Exception)
                System.out.println(true);
            System.out.println("ArithmeticException");
        } catch (Exception e){ // 위의 catch 문에서 이미 오류가 잡혔으므로 실행되지 않는다.
            System.out.println("Exception");
        }
        System.out.println(5);
    }
}
