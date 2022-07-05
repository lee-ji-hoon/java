package 자바의정석.ch6;

import java.util.Arrays;

public class Ex6_16 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("int, int : "+mm.add(3, 3));
        System.out.println();
        System.out.println("long long : "+mm.add(3L, 3L));
        System.out.println();
        // add(long, int) add(int, long)은 없지만
        // long과 int 중 더 큰 값인 long으로 통일돼서 가는 것을 볼 수 있다.
        System.out.println("int long : "+mm.add(3, 3L));
        System.out.println();
        System.out.println("long int : "+mm.add(3L, 3));
        System.out.println();
        int[] a = {10, 20, 30, 40};
        System.out.println("int[] a : " + mm.add(a));
    }
    private static class MyMath{
        int add(int a, int b){
            System.out.println("int add(int a, int b)");
            return a + b;
        }

        long add(long a, long b){
            System.out.println("long add(long a, long b)");
            return a + b;
        }
        int add(int[] a){
            System.out.println("int add(int[] a) ");
            return Arrays.stream(a).sum();
        }
    }
}
