package 자바의정석.ch7.pgk2;

import 자바의정석.ch7.pkg1.MyParent;

// 다른 패키지이므로 MyParent가 default 접근 제어자라 접근 불가능
// MyParent를 public으로 그리고 원래 public을 default로 변경
// 그 후 java 파일 이름 변경
class MyChild extends MyParent {
    public void printMember() {
        // prv는 private 즉 클래스 내에서만 접근 가능하므로 오류
//        System.out.println("prv = " + prv);
        // def는 default 즉 패키지 내에서만 접근 가능하므로 오류
//        System.out.println("dft = " + dft);
        System.out.println("prt = " + prt);
        System.out.println("pub = " + pub);
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyChild m = new MyChild();
        // 오류 접근 제한
//        System.out.println("prv = " + m.prv);
        // 오류 접근 제한
//        System.out.println("dft = " + m.dft);
        // 오류 접근 제한
//        System.out.println("prt = " + m.prt);
        System.out.println("pub = " + m.pub);
        m.printMember();
    }
}
