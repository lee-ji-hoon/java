package 자바의정석.문제풀이.ch4;

import java.util.Arrays;

public class Exercise4_2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum2 = 0;
        for(int i = 1; i <= 20; i++) {
            arr[i - 1] = i;
            if(i % 2 != 0 && i % 3 != 0)
                sum2 += i;
        }
        int sum = Arrays.stream(arr)
                .filter(i -> i % 2 != 0 && i % 3 != 0)
                .sum();
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
    }
}
