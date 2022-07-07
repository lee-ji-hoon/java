package 자바의정석.ch9;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // eqauls를 오버라이딩했으면 hashCode도 오버라이딩 해야 한다.
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Card))
            return false;
        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    @Override
    public String toString(){
        return "kind : " + kind + ", number : " + number;
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());
        /*
         * c1.equals(c2) = true
         * c1.hashCode() = -1842861219
         * c2.hashCode() = -1842861219
         */

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        /* 재정의 전
            자바의정석.ch9.Card@35bbe5e8
            자바의정석.ch9.Card@2c8d66b2
        */
        /* 재정의 후
            kind : SPADE, number : 1
            kind : SPADE, number : 1
        */
    }
}
