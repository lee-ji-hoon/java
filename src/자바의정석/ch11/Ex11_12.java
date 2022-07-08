package 자바의정석.ch11;



import java.util.*;

class Ex11_12 {
    public static void main(String args[]) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");	 setA.add("2");  setA.add("3");
        setA.add("4");  setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");	 setB.add("5");  setB.add("6");
        setB.add("7");  setB.add("8");
        System.out.println("B = "+setB);

        setA.retainAll(setB); // 교집합
        setA.addAll(setB); // 합집합
        setA.removeAll(setA); // 차집합
    }
}
