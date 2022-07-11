package 자바의정석.ch14;

import java.util.*;

class Ex14_4 {
    public static void main(String[] args) 	{
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(i);

        // list의 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        // list에서 2 또는 3의 배수를 제거한다.
        System.out.println("2, 3의 배수 제거");
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        System.out.println("각 요소 10 곱하기");
        list.replaceAll(i->i*10); // list의 각 요소에 10을 곱한다.
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "2");
        map.put("4", "2");
        map.put("5", "3");
        map.put("6", "4");

        // map의 모든 요소를 {k,v}의 형식으로 출력한다.
        System.out.println("map의 모둔 요소 출력");
        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        ArrayList<String> arr = new ArrayList<>();
        // value가 2인 k값 추가 하는 방법
        map.forEach((k, v) -> {
            if(v.equals("2"))
                arr.add(k);
        });
        System.out.println();
        arr.forEach(i -> System.out.print(i + " "));
        arr.forEach(System.out::println);
    }
}

