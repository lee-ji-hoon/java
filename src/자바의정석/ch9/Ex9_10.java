package 자바의정석.ch9;

class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
        // 속도가 좀 더 빠르다.
        String strVal = String.valueOf(iVal); // int를 String으로 변환한다.

        double dVal = 200.0;
        // String.valueOf() 보다 속도가 느리다.
        String strVal2 = dVal + "";	// int를 String으로 변환하는 또 다른 방법

        double sum  = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
        // valueOf()는 대신 참조형으로 나온다 Integer + Doubile -> 오토박싱 -> int + double -> double + double
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
