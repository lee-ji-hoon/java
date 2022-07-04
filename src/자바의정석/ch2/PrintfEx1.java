package 자바의정석.ch2;

public class PrintfEx1 {
    public static void main(String[] args) {
        System.out.println(10.0/3);

        // - 정수를 10진수, 8진수, 16진수, 2진수로 출력
        System.out.printf("%d", 15) ;                                //15          10진수
        System.out.printf("%o", 15);                                 //17           8진수
        System.out.printf("%x", 15);                                 // f            16진수
        System.out.printf("%s", Integer.toBinaryString(15));   // 1111           2진수 s는 문자열 출력

        // - 8진수와 16진수에 접두사 붙이기
        System.out.printf("%#o", 15) ;                             // 017
        System.out.printf("%#x", 15);                              // 0xf
        System.out.printf("%#X", 15);                              // 0XF

        // - 실수 출력을 위한 지시자 %f
        // - 지수형식 %e  (간략한 형식 %g)
        float f = 123.4567890f;
        System.out.printf("%f", f);                                   // 123.456787     소수점아래 6자리
        System.out.printf("%e",f);                                   //  1.23458e+02   지수 형식

        // *float는 정밀도가 7이여서 7자리까지 정확 뒤의 숫자는 의미없는 숫자
        //  double은 정밀도가 15 따라서 15자리까지 정확!
        double d = 123.456789;
        System.out.printf("%f%n", d);                            //123.456789
        System.out.printf("%e%n", d);                           //1.234568e+02
        System.out.printf("%g,%n",d);                           //123.457

        System.out.printf("[5d]%n", 10);              //[   10]         5자리 출력
        System.out.printf("[5d]%n", 123456);        // [123456]     5자리 출력이지만, 입력이 123456이라서 [123456] 출력
        System.out.printf("[%-5d]%n", 10);           // [10   ]       -는 왼쪽정렬
        System.out.printf("[%05d]%n", 10);           //[00010]        빈자리는 0을 붙임

        // %전체자리.소수점아래자지f
        System.out.printf("%14.10f%n", d);          // 전체 14자리 중 소수점 아래 10자리
        // 소수점 앞자리의 경우 빈자리는 공백, 소수점 뒷자리의 경우 빈자리는 0

        // 문자열의 경우 지시자 s 사용
        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url) ;                   //[www.codechobo.com]
        System.out.printf("[%20s]%n", url);                 //[공백www.codechobo.com]
        System.out.printf("[%-20s]%n", url);                //[www.codechobo.com공백]
        System.out.printf("[.8s]%n", url);                    // 문자열의 일부만 출력 가능 [www.code] 전체 문자열 중 8글자만 출력
    }
}
