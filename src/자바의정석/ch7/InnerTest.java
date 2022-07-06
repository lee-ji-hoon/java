package 자바의정석.ch7;

class AA{
    static int i; // static으로 선언해줘야 한다.
    BB b = new BB();

    static class BB{ // static 클래스로 선언해주는게 옳다.
        void method() {
            System.out.println(i);
        }
    }

}
class CC{
    AA.BB b = new AA.BB();
}

public class InnerTest {
    public static void main(String[] args) {
        AA.BB ab = new AA.BB();
        ab.method();
    }
}
