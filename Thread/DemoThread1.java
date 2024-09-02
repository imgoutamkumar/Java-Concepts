package Thread;

class Library {

    synchronized public void noOfTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "*" + i + "=" + i * n);
        }
    }

}

class ThreadA extends Thread {

    Library y1 = new Library();

    @Override
    public void run() {
        y1.noOfTable(5);
    }
}

class ThreadB extends Thread {

    Library y1 = new Library();

    @Override
    public void run() {
        y1.noOfTable(6);
    }
}

public class DemoThread1 extends Thread {

    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ta.start();
        ThreadB tb = new ThreadB();
        tb.start();
    }
}