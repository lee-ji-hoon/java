package 자바의정석.ch3;

public class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000; // 10의 6제곱
        int b = 2_000_000; // 10의 6제곱

        // 10의 12제곱이 결과인데 int는 10의 9제곱까지만 가능하다.
//        long c = a * b;
        // 더 큰 타입의 연산자로 맞추기 때문에 한 쪽만 long으로 맞춰주면 된다.
        // long * int -> long * long
        long c = (long) a * b;
        System.out.println("c = " + c);
    }
}
