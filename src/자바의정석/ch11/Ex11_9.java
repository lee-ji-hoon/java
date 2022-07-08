package 자바의정석.ch11;

import java.util.*;

class Ex11_9 {
    public static void main(String[] args) {
        // [1(String), 1(Integer), 2, 3, 4]
        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        // HashSet에 저장된 요소들을 출력한다.(Iterator이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
