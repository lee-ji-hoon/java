package 자바의정석.ch3;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println("shortPi = " + shortPi);

        int x = 10;
        int y = 8;

        System.out.printf("%d을 %d로 나누면 %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x / y, x % y);
    }
}
