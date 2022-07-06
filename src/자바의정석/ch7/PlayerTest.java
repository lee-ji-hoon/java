package 자바의정석.ch7;

abstract class Player{
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player{

    @Override
    void play(int pos) {
        System.out.println(pos + " 위치부터 play합니다.");
    }

    @Override
    void stop() {
        System.out.println("멈추겠습니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        Player p = new AudioPlayer();
        p.play(100);
        p.stop();
    }
}
