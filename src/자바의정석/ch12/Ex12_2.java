package 자바의정석.ch12;

import java.util.*;

class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("자바", new Student("자바왕", 1, 1, 100, 100, 100));
        map.put("파이썬", new Student("파이썬", 1, 1, 100, 100, 100));
        map.put("C", new Student("C++", 1, 1, 100, 100, 100));
        for (Map.Entry<String, Student> entry : map.entrySet())
            System.out.println("key 값 : " + entry.getKey() + " 이름 값 : " + entry.getValue().name);
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

