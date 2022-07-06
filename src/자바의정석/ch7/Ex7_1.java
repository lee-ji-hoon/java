package 자바의정석.ch7;

class Tv {
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

class SmartTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption)
            System.out.println(text);
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.channel = 10;
        smartTv.channelUp();
        System.out.println("smartTv.channel = " + smartTv.channel);

        smartTv.displayCaption("Hello");
        smartTv.caption = true;
        smartTv.displayCaption("Helllllooo");
    }
}
