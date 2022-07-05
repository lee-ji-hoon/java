package 자바의정석.ch4;

public class Ex4_7 {
    public static void main(String[] args) {
        // 1 ~ 10의 난수 출력
        for (int i = 1; i <= 20 ; i++) {
            System.out.println((int) (Math.random() * 10) + 1);
        }
    }
}
