package 자바의정석.ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();   // 에러.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);

        FruitBox<Fruit> fbox = new FruitBox<Fruit>();
        // FruitBox<Apple? -> FuitBox<? extends Fruit>
        FruitBox<? extends Fruit> abox = new FruitBox<Apple>();
        // FruitBox<? extends Fruit> -> FruitBox<Apple> 가능?
        // 경고 발생
        // ast may be removed by changing the type of 'abox' to 'FruitBox<Apple>'
        FruitBox<Apple> appleBox2 = (FruitBox<Apple>) abox;

    }  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);     }
    T get(int i)     { return list.get(i); }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}
