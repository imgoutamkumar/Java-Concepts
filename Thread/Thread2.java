package Thread;

//User defined thread using runnable interface
// thread class contains the start method
public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}
