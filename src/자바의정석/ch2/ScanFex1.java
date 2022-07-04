package 자바의정석.ch2;

import java.util.Scanner;

public class ScanFex1 {
    public static void main(String[] args) {
        // System.in 은 화면상에 내용을 입력받겠다는 의미
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        // 한 줄 입력
        String input = sc.nextLine();
        System.out.println("input = " + input);

        // input 숫자로 변환
        int stringToInt = Integer.parseInt(input);
        System.out.println("stringToInt = " + stringToInt);
    }
}
