package 자바의정석.ch14;

import java.util.function.*;
import java.util.*;

class Ex14_2 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i / 10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list); // 짝수 출력
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }
//    Function<Integer, Integer> f = i -> i / 10 * 10;
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

//    Consumer<Integer> c = i -> System.out.print(i + ", ");
//    Predicate<Integer> p = i -> i % 2 == 0;
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for(T i : list) {
            if (p.test(i)) { // 짝수인지 검사
                c.accept(i);
            }
        }
        System.out.println("]");
    }
//    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // 공급자로부터 1 ~ 100 사이의 난수 받음
        }
    }
}
