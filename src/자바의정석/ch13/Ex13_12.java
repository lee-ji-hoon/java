package 자바의정석.ch13;



class Ex13_12 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx12();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}

class Account {
    private int balance = 1000;

    public synchronized int getBalance() {
        return balance;
    }
    // synchronized를 붙이면 동기화를 해놨기에 -로 떨어질 일이 없다.
    public synchronized void withdraw(int money){
        if(balance >= money) {
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    } // run()
}
