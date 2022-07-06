package 자바의정석.ch7.pkg1;

public class MyParent{
    private int prv; // 같은 클래스
    int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; // 접근 제한 없음

    public void printMember() {
        System.out.println("prv = " + prv);
        System.out.println("dft = " + dft);
        System.out.println("prt = " + prt);
        System.out.println("pub = " + pub);
    }
}

class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println("prv = " + p.prv); // 오류 접근 제한
        System.out.println("dft = " + p.dft);
        System.out.println("prt = " + p.prt);
        System.out.println("pub = " + p.pub);

        p.printMember();
    }
}
