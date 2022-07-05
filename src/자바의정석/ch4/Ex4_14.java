package 자바의정석.ch4;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int num =0, sum  = 0;
        System.out.println("숫자를 입력하세요");

        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        num = Integer.parseInt(temp);

        while(num !=0){
            // 10으로 나눈 나머지를 sum에 더하기
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10;
        }

        System.out.println("각 자리수의 합 : " + sum);
    }
}
