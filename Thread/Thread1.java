package Thread;

//User defined thread using thread class
public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 1; i--) {
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }

}
