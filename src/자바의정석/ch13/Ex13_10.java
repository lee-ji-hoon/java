package 자바의정석.ch13;



class Ex13_10 {
    public static void main(String args[]) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();	// 쓰레드 th1을 잠시 중단시킨다.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();	// 쓰레드 th1이 다시 동작하도록 한다.
            Thread.sleep(3000);
            th1.stop();		// 쓰레드 th1을 강제종료시킨다.
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {}
    } // main
}

class MyThread implements Runnable {
    // volatile을 붙여야지 종료된다.
    // vloatile을 사용할 경우 원본을 사용하기 때문이다.
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    Thread th;

    MyThread(String name){
        th = new Thread(this, name); // Thread (Runnable r, String name;
    }

    void start() {
        th.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }

    void resume() {
        suspended = false;
    }

    public void run() {
        while(!stopped) {
            if(!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    } // run()
}
