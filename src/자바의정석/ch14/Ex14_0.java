package 자바의정석.ch14;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;
//        Function<Integer, MyClass> s = (i) -> new MyClass(i);
        Function<Integer, MyClass> s = MyClass::new;

        MyClass mc = s.apply(100);
        System.out.println("mc.iv = " + mc.iv);
        System.out.println("s.apply(200).iv = " + s.apply(200).iv);

        Function<Integer, int[]> f = (i) -> new int[i];
        System.out.println("f.apply 배열 길이 : " + f.apply(100).length);
    }
}

class MyClass {
    int iv;

    public MyClass(int iv) {
        this.iv = iv;
    }
}
