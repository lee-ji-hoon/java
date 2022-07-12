package 자바의정석.문제풀이.ch3;

class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        // 첫 괄호가 (1) 두번째 괄호가 (2)
        char lowerCase = (
                ch >= 'A' && ch <= 'Z'
                /* (1) */
        ) ? (
                (char)(ch + 32)
                /* (2) */
        ) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}