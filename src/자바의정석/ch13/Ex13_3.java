package 자바의정석.ch13;



class Ex13_3 {
    static long startTime = 0;

    public static void main(String args[]) {
        ThreadEx3_1 th1 = new ThreadEx3_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for(int i=0; i < 50; i++)
            System.out.printf("%s", new String("-"));
        System.out.println();
        System.out.println("첫 for문 시작부터 끝까지 걸린 시간 :" + (System.currentTimeMillis() - Ex13_3.startTime));
    }
}

class ThreadEx3_1 extends Thread {
    public void run() {
        for(int i=0; i < 50; i++)
            System.out.printf("%s", new String("+"));
        System.out.println();
        System.out.println("두 번째 for문 시작부터 끝까지 걸린 시간 :" + (System.currentTimeMillis() - Ex13_3.startTime));
    }

//    ---------------++++++++-----------------------------------
//            ++++++++++++++++++++++++++++++++++++++++++
//    첫 for문 시작부터 끝까지 걸린 시간 :42
//    두 번째 for문 시작부터 끝까지 걸린 시간 :47
}
