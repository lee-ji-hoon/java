package 자바의정석.문제풀이.ch4;

class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            /*(1) . 알맞은 코드를 넣어 완성하시오*/
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("sum="+sum);
    }
}