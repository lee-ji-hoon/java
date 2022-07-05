package 자바의정석.ch5;

import java.util.Arrays;

public class Ex5_1_temp {
    public static void main(String[] args) {
        int[] score = new int[5]; // 배열 score를 5칸으로 선언과 생성(참조 변수)
        
        score[3] = 100; // 0 0 0 100 0
        System.out.println("score[0] = " + score[0]);
        System.out.println("score[1] = " + score[1]);
        System.out.println("score[2] = " + score[2]);
        System.out.println("score[3] = " + score[3]);
        System.out.println("score[4] = " + score[4]);

        int value = score[3];
        System.out.println("value = " + value);

        // String 클래스의 주요 메서드
        //            01234
        String str = "ABCDE";

        char ch = str.charAt(4); // E
        String substring1 = str.substring(0, 4);// ABCD
        String substring2 = str.substring(1);// BCDE
        System.out.println("ch = " + ch);
        System.out.println("substring1 = " + substring1);
        System.out.println("substring2 = " + substring2);

        // Arrays 다루기
        int[] arr = {4, 1, 2, 3, 0};
        int[][] arr2D = {{11, 12}, {21, 22}};

        Arrays.sort(arr); // 오름차순으로 정렬

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"ccc", "ddd"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"ccc", "ddd"}};

        System.out.println(Arrays.deepEquals(str2D2, str2D));

        // 배열, form, to
        int[] arr2 = Arrays.copyOfRange(arr, 2, arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}
