package 자바의정석.ch4;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("현재 월 입력");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){
            case 3 : case 4 : case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6 : case 7 : case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("현재의 계절은 가을 입니다.");
                break;
            default :
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}
