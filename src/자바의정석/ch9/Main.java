package 자바의정석.ch9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*String i = "100";
        System.out.println("i = " + Integer.parseInt(i));
        System.out.println("i(10) = " + Integer.parseInt(i, 10));
        System.out.println("i(2) = " + Integer.parseInt(i, 2));
        System.out.println("i(16) = " + Integer.parseInt(i, 16));

        i = 100
        i(10) = 100
        i(2) = 4
        i(16) = 256*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100); // 이전에는 에러가 났음
        list.add(new Integer(100)); // 위의 내용을 이렇게 바꿔서 처리해줌 오토박싱

        Integer i = list.get(0); // 0번째 객체 꺼냄
        int j = list.get(0); // int형으로도 가능함 이렇게 가능한게 오토언박싱 덕 -> intVlalue()가 생략된 모습

    }
}
