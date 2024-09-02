package Thread;

public class MyThread {

    public static void main(String[] args) {
        // calling thread 2
        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        System.out.println(Thread.currentThread());
        thread.start();
        // calling thread 1
        Thread1 t1 = new Thread1();
        t1.start();

    }
}
