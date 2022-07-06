package 자바의정석.ch7;

public class Ex7_12 {
    class InstatnceInner{
        int iv = 100;
//        static int cv = 100; // static 변수를 사용할 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용된다.
    }

    static class StaticInner{
        int iv = 1200;
        static int cv = 200; // static 클래스만이 static 멤버를 정의할 수 있다.
    }

    void myMethod(){
        class LocalInner {
            int iv = 300;
//            static int cv = 300; // static 클래스가 아니면 접근 안됨
            final static int CONST = 300; // final static은 상수이므로 허용된다.
        }
    }
}
