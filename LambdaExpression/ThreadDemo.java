package LambdaExpression;

public class ThreadDemo {
    public static void main(String[] args) {
        // *Runnable is a functional interface so we can use lambda expresssion to
        // implement Runnable interface.

        // *Creating two thread thread1 and thread2
        Runnable thread1 = () -> {
            // thread body
            for (int i = 0; i < 10; i++) {
                System.out.println("thread 1 :" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Runnable thread2 = () -> {
            // thread body
            for (int i = 1; i <= 10; i++) {
                System.out.println("thread 2 :" + i * 2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        // calling run method using lambda expression
        thread1.run();
        thread2.run();
        System.out.println("calling thread using start method");
        Thread t1 = new Thread(thread1);
        t1.start();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
