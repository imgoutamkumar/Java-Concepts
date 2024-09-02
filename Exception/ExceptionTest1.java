public class ExceptionTest1 {
    public static void main(String[] args) {

        System.out.println(printNumber());
    }

    /*
     * we didn't get any exception and as we know finally block always be executed.
     * so, here finally block override the try block
     */

    public static int printNumber() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            System.out.println("Finally block always be executed");
            return 5;
        }
    }
}
