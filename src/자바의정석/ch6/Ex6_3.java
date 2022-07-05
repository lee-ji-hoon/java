package 자바의정석.ch6;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "Heart";
        c1.number = 7;

        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1.kind = " + c1.kind);
        System.out.println("c1.number = " + c1.number);
        System.out.println("c2.kind = " + c2.kind);
        System.out.println("c2.number = " + c2.number);
        System.out.println("c1의 세로 : " + c1.height + " 가로 : " + c1.width);
        System.out.println("c2의 세로 : " + c2.height + " 가로 : " + c2.width);
        
        // static에 접근을 하면 인텔리제이에서 참조변수 자체로 바꿀것을 권장한다.
        // c1.height -> Card.height 으로 접근하기 때문 굳이 필요없는 과정을 삭제하고, 다른 사람들이 봤을때 헷가릴지 않게 하기 위해서
        c1.width = 50;
        c1.height = 100;
        System.out.println("c1 인스턴스에 접근해서 높이 변경 후 c2의 값도 변경 될까?");
        System.out.println("c2.height = " + c2.height);
        System.out.println("c2.width = " + c2.width);
        // static으로 선언할 경우 static 영역 안에서 width, height 메모리가 할당이 되고 Card의 모든 인스턴스들은 해당 영역을 참조하기 때문이다.
    }
}

class Card{
    String kind;
    int number;
    static int width = 250;
    static int height = 150;
}
