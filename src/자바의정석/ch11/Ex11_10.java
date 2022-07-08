package 자바의정석.ch11;

import java.util.*;

class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
        }

        // 정렬의 기본 조건이 순서가 유지돼야 하기 때문에 list로 변경 후에 sort가 가능하다.
        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list);          // Collections.sort(List list)
        System.out.println(list);
    }
}
