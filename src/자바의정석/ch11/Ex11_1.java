package 자바의정석.ch11;

import java.util.*;

class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity) 가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        // ArrayList에는 객체만 저장 가능
        // 오토박싱으로 의해 기본형이 참조형으로 바꿔줌
        // list1.add(10) -> list1.add(new Integer(10));
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // subList는 리스트의 특정 부분만 뽑아서 새롭게 만들때 사용한다.
        // 단 읽기 전용이다. 그래서 새로운 리스트를 만들어서 수정을 해야만 한다.
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        // 정렬
        // 내림차순은 Collections.sort(list, Collections.reverseOrder()) 이다.
//        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list1);	// list1과 list2를 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2):"
                + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        list1.add(2, 1);
        print(list1, list2);
        // indexOf()는 지정된 객체의 위치(index)를 알려준다.
        // 값이 int, String이냐에 따라 다르다.
        System.out.println("index = " + list1.indexOf("1"));
        // 1 0 1 2 4 -> 2가 나온다. 첫 1이 무시되는 이유는 String이기 때문이다.
        System.out.println("index = " + list1.indexOf(1));

        // 만약 값이 1인 것을 삭제하고 싶을 때?
//        list1.remove(1); // 인덱스가 1인 객체를 삭제하게 된다. -> 원하던 값이 아니다!
        // list1:[1, 0, 1, 2, 4]
        // list1:[1, 1, 2, 4]

        // 해결 방법
        list1.remove(new Integer(1)); // 이렇게 인덱스와 vlaue를 헷갈리지 않게 정확히 지정해줘야 한다.
        // list1:[1, 0, 1, 2, 4]
        // list1:[1, 0, 2, 4]

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
} // class
