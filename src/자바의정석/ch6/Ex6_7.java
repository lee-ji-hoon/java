package 자바의정석.ch6;

class Data{
    int x;
}

public class Ex6_7 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);
        changePri(d.x);
        System.out.println("기본형 매개변수 변경");
        System.out.println("d.x = " + d.x);
        change(d);
        System.out.println("참조형 매개변수로 변경 후");
        System.out.println("d.x = " + d.x);
    }
    private static void changePri(int x){
        x = 1000;
    }

    private static void change(Data d) {
        d.x = 1000;
    }
    /*
    d.x = 10
    기본형 매개변수 변경
    d.x = 10
    참조형 매개변수로 변경 후
    d.x = 1000
    */
}
