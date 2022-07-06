package 자바의정석.ch7;

class MyPoint extends Object{
    int x;
    int y;
}

// 상속
//class Circle extends MyPoint{
//    int r;
//}

// 포함
class Circle extends Object {
    MyPoint p = new MyPoint();
    int r;
}
public class InheritanceTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString()); // 자바의정석.ch7.Circle@2c8d66b2
        Circle circle2 = new Circle();
        System.out.println(circle2.toString()); // 자바의정석.ch7.Circle@5a39699c

    }
}
