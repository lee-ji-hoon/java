package 자바의정석.ch7;

abstract class Unit{
    abstract void move(int x, int y);
    void stop(){}
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("Marine의 좌표는 ("+x+","+y+")입니다.");
    }

    void stimPack() {
    }
}

class Tank extends Unit{
    @Override
    void move(int x, int y){
        System.out.println("Tank의 좌표는 ("+x+","+y+")입니다.");
    }
    void chaneMode() {

    }
}

class Dropship extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Dropship의 좌표는 ("+x+","+y+")입니다.");
    }
}

public class Ex7_10 {
    public static void main(String[] args) {
        Unit tank = new Tank();
        Unit marine = new Marine();
        Unit dropship = new Dropship();

        tank.move(3, 5);
        marine.move(1, 2);
        dropship.move(4, 19);
    }
}
