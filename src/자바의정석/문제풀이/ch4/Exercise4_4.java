package 자바의정석.문제풀이.ch4;

public class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while(true){
            sum = number % 2 == 0 ? sum + (number * -1) : sum + number;
            if(sum == 100)
                break;
            number++;
        }
        System.out.println("number = " + number);
    }
}
