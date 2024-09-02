public class UsingTryandCatch {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
            System.out.println(data);
        }
        // handling the exception using catch block
        // you can add as many block as you want
        catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block always executed whether you found exception or not");
        }
        System.out.println("rest of the code");
    }
}
