package 자바의정석.ch7;

class A {
    public void method(I i) { // 인터페이스 I를 구현한 것들만 가능
        i.method();
    }
}

interface I {
    public abstract void method();
}

class B implements I {
    @Override
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I {
    @Override
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C()); // C를 호출해도 A클래스를 건들지 않아도 된다.
    }
}
