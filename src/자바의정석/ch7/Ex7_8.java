package 자바의정석.ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}
class Tv1 extends Product{
    Tv1(){
        super(100);
    }
    public String toString(){
        return "TV";
    }
}
class Computer extends Product{
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
class Buyer{
    int money;
    int bonusPoint;
    public Buyer(int money){
        this.money = money;
        bonusPoint = (int) (money / 10);
    }
    void buy(Product p){
        if (money < p.price)
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        else{
            money -= p.price;
            bonusPoint += p.bonusPoint;
            System.out.println(p + "를 구입하셨습니다.");
        }
    }
}
public class Ex7_8{
    public static void main(String[] args) {
        Buyer b = new Buyer(1000);
        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 : " + b.money);
        System.out.println("현재 남은 포인트는 : " + b.bonusPoint);
    }
}


