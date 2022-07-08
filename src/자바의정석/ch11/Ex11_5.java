package 자바의정석.ch11;

import java.util.*;

class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        // ArrayList에서 Set으로 변경돼도 표준화된 상태이기 때문에 상관이 없다.
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("for문으로 읽기");
        // for문으로 읽기
        for (Object o : list) {
            System.out.println(o);
        }
    } // main
}
