package 자바의정석.ch5;

import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        // 랜덤으로 섞기
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(num));

        // 100번 섞기
        for (int i = 0; i <= num.length / 2; i++) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);
            if(x == y)
                continue;
            int temp = num[x];
            num[x] = num[y];
            num[y] = temp;
        }
        System.out.println("무작위로 섞은 후");
        System.out.println(Arrays.toString(num));
    }
//    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//    무작위로 섞은 후
//    [2, 1, 7, 0, 6, 5, 4, 3, 9, 8]
}
