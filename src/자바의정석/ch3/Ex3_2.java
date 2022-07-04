package 자바의정석.ch3;

public class Ex3_2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++; // 후위
        System.out.println("후위형 결과 i = " + i + " j = " + j);
        i = 5; j =0;
        j = ++i; // 전위
        System.out.println("전위형 결과 i = " + i + " j = " + j);
    }
}
