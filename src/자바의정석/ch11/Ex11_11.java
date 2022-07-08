package 자바의정석.ch11;

import java.util.*;

class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return false;
        Person p = (Person) obj;
        return p.age == this.age && p.name.equals(this.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

    public String toString() {
        return name +":"+ age;
    }
}
