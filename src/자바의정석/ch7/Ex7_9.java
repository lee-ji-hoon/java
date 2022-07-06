package 자바의정석.ch7;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}
class Tv2 extends Product2{
    Tv2(){
        super(100);
    }
    public String toString(){
        return "TV";
    }
}
class Computer2 extends Product2{
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2{
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money;
    int bonusPoint;
    int count = 0;
    Product2[] cart = new Product2[10];

    public Buyer2(int money){
        this.money = money;
        bonusPoint = (int) (money / 10);
    }

    void buy(Product2 p){
        if (money < p.price)
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        else{
            money -= p.price;
            bonusPoint += p.bonusPoint;
            cart[count++] = p;
            System.out.println(p + "를 구입하셨습니다.");
        }
    }

    public void summary() {
        int sum = 0;
        StringBuilder items = new StringBuilder();

        for (Product2 p : cart) {
            if(p == null)
                break;
            sum += p.price;
            items.append(p.toString()).append(" ");
        }
        System.out.println("구매한 아이템 목록 : " + items.toString());
        System.out.println("구매한 아이템 총 금액 : " + sum);
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2(1000);

        b.buy(new Tv2());
        b.buy(new Computer2());

        System.out.println("현재 남은 돈은 : " + b.money);
        System.out.println("현재 남은 포인트는 : " + b.bonusPoint);
        b.summary();
    }
}
