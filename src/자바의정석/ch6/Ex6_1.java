package 자바의정석.ch6;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t = new Tv(); // Tv인스턴스 참조하기 위한 변수 t선언과 동시에 인스턴스 값 생성
        t.channel = 7; // Tv인스턴스 t의 채널값을 7로 선언
        t.channelDown(); // Tv인스턴스의 channelDown 메서드 실행
        System.out.println("현재 채널은 = " + t.channel);
    }
}

class Tv{
    String color;
    boolean power;
    int channel;

    void power(){
        this.power =! this.power;
    }
    void channelUp(){
        this.channel += 1;
    }
    void channelDown(){
        this.channel -= 1;
    }
}
