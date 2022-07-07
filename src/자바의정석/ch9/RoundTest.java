package 자바의정석.ch9;

public class RoundTest {
    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        for (double d = 1.5; d <= 10.0; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);
            System.out.println("d = " + d + " d1 = " + d1 + " d2 = " + d2);

            sum+=d;
            sum1+=d1;
            sum2+=d2;

            System.out.println("============");
            System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
        }
    }
    /*
     d = 1.5 d1 = 2.0 d2 = 2.0
    ============
     1.5  2.0  2.0
    d = 2.5 d1 = 3.0 d2 = 2.0
    ============
     4.0  5.0  4.0
    d = 3.5 d1 = 4.0 d2 = 4.0
    ============
     7.5  9.0  8.0
    d = 4.5 d1 = 5.0 d2 = 4.0
    ============
    12.0 14.0 12.0
    d = 5.5 d1 = 6.0 d2 = 6.0
    ============
    17.5 20.0 18.0
    d = 6.5 d1 = 7.0 d2 = 6.0
    ============
    24.0 27.0 24.0
    d = 7.5 d1 = 8.0 d2 = 8.0
    ============
    31.5 35.0 32.0
    d = 8.5 d1 = 9.0 d2 = 8.0
    ============
    40.0 44.0 40.0
    d = 9.5 d1 = 10.0 d2 = 10.0
    ============
    49.5 54.0 50.0
     *
     */
}
