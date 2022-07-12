package 자바의정석.문제풀이.ch3;

class Exercise3_9 {
    public static void main(String[] args) {
        char ch = '1';
        boolean b = ( /* (1) */
                Character.isAlphabetic(ch) || (Character.isDigit(ch))
        );
        System.out.println(b);
    }
}