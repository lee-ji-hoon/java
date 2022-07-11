package 자바의정석.ch13;

class Ex13_6 {
    public static void main(String args[]) {
        ThreadEx6_1 th1 = new ThreadEx6_1();
        ThreadEx6_2 th2 = new ThreadEx6_2();

        th2.setPriority(7);
        // th2의 우선순위가 더 높다. default값이 5이기 때문에
        // 우선순위의 값이 높을수록 먼저 끝나야함!
        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadEx6_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("-");
            for(int x=0; x < 10000000; x++);
        }
    }
}

class ThreadEx6_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("|");
            for(int x=0; x < 10000000; x++);
        }
    }
}
