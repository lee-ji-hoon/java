package 자바의정석.ch2;

public class Ex2_1 {
    public static void main(String[] args) {
        System.out.println("Hello"); // 출력 후 줄바꿈
        System.out.print("Hello"); // 출력 후 줄바꿈 하지 않음

        // 숫자 출력하기
        System.out.println("3+5"); // 문자로 취급하기 때문에 3+5 출력
        System.out.println(3+5); // 3+5를 계산 -> 8 출력
        System.out.println(3-5); // 뺄
        System.out.println(3*5); // 곱
        System.out.println(3/5); // 나눗셈
        System.out.println(3%5); // 나머지
    }
}
