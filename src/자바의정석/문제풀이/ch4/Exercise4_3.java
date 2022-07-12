package 자바의정석.문제풀이.ch4;

public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            total += sum;
        }
        System.out.println(total);
    }
}
