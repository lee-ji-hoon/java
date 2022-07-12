package 자바의정석.문제풀이.ch4;

class Exercise4_15 {

    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
        while (tmp != 0) {
            /*
            (1) . 알맞은 코드를 넣어 완성하시오
            */
            int remainder = tmp % 10;

            result = result * 10 + remainder;
            tmp = tmp / 10;
        }
        if (number == result)
            System.out.println(number + "는 회문수 입니다 .");
        else
            System.out.println(number + "는 회문수가 아닙니다 .");
    } // main
}