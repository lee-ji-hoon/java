package 자바의정석.ch4;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'C';
        char opt = '0';

        System.out.println("점수 입력");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score >= 90){
            grade ='A';
            if(score >= 98){
                opt = '+';
            } else if(score < 94){
                opt = '-';
            }
        } else if(score >= 80){
            grade = 'B';
            if(score >= 88){
                opt = '+';
            } else if(score < 84){
                opt = '-';
            }
        }

        System.out.println("당신의 학점은 : " + grade + opt + " 입니다.");
    }
}
