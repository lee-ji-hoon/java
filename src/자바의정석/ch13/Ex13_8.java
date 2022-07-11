package 자바의정석.ch13;

class Ex13_8 {
    public static void main(String args[]) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start(); th2.start();
        delay(2 * 1000);


        System.out.print("main 종료");
    } // main
    static void delay(long millis) {
        try {
//            th1.sleep(2000); // th1을 종료시킨다는 건가?
            // 하지만 현실은 바로 "-"이 찍히는것을 볼 수 있다.
            // 즉 이 코드는 main 쓰레드가 잠자는 것을 볼 수 있다.
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) System.out.print("-");
        System.out.print("th1 종료");
    } // run()
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) System.out.print("|");
        System.out.print("th2 종료");
    } // run()
}
