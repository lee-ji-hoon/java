package 자바의정석.문제풀이.ch4;

class Exercise4_7 {
    public static void main(String[] args) {
        int value = ( /* (1) */
            (int)(Math.random() * 10 + 1)
        );
        System.out.println("value:" + value);
    }
}
