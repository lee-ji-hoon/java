package 자바의정석.ch6;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long a = 5L, b = 3L;
        long add = myMath.add(a, b);
        long subtract = myMath.subtract(a, b);
        long multiply = myMath.multiply(a, b);
        double divide = myMath.divide(a, b);
        long max = myMath.max(a, b);
        myMath.printGugudan(8);

        System.out.println("add = " + add);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("max = " + max);
    }
}

class MyMath{
    void printGugudan(int dan){
        // 2~9단 까지가 아닌 경우 return
        if(!(2 <= dan && dan <= 9))
            return;

        System.out.println("구구단 시작");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, i * dan);
        }
        System.out.println("구구단 끝");

    }
    long add(long a, long b){
        return a + b;
    }
    long subtract(long a, long b){
        return a - b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }

    // 두 값중 큰 값 반환
    long max(long a, long b){
        return a > b ? a : b;
    }
}
