package 자바의정석.ch5;

public class Ex5_2 {
    public static void main(String[] args) {
        // 총합과 평균 구하기
        int sum = 0; // 총합
        float average = 0f; // 평균

        int[] score = {100, 88, 100, 100, 90};
        for (int j : score) {
            sum += j;
        }

        // int / float -> float / float
        average = sum /(float) score.length;
        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);
    }
}
