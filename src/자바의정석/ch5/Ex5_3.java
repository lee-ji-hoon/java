package 자바의정석.ch5;

public class Ex5_3 {
    public static void main(String[] args) {
        // 최소 최대 구하기
        int[] score = {15, 24, 66, 75, 91, 10};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            // if else문으로도 가능
            max = Math.max(max, score[i]);
            min = Math.min(min, score[i]);
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
