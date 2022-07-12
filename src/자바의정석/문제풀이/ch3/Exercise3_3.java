package 자바의정석.문제풀이.ch3;

public class Exercise3_3 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println( /* (1) */
                num > 0 ? "양수" : (num == 0 ? "0" : "음수")
        );
    }
}
