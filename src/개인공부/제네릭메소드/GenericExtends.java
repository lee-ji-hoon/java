package 개인공부.제네릭메소드;

// is not within its bound; should implement 'java.lang.Comparable
//class SaltClass <E extends Comparable<E>> { }
class SaltClass <E extends Comparable<? super E>> {

}

class Person{ }

class Student extends Person implements Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

public class GenericExtends {
    public static void main(String[] args) {
        SaltClass<Student> a = new SaltClass<Student>();

    }
}
