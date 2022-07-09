package 자바의정석.ch12;

import java.util.ArrayList;

class Tv{

}

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
//        list.add("30"); // Integer만 저장할 수 있으니 오류가 생김
        Integer integer = list.get(1);

    }
}
