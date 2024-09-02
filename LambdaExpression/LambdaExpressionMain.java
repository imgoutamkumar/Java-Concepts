package LambdaExpression;

public class LambdaExpressionMain {
    public static void main(String[] args) {
        FunctionalInterface1Impl fImpl1 = new FunctionalInterface1Impl();
        fImpl1.function1();
        System.out.println("---------------------------------------");

        // using our interface with the help of lambda
        // No need to implement the interface
        // provide implementaion using lambda
        FunctionalInterface1 f1 = () -> {
            System.out.println("function1 working using Lambda Expression ");
        };
        f1.function1();
        System.out.println("---------------------------------------");
        // provide implementaion using lambda
        FunctionalInterface2 addNumber = (a, b) -> {
            return a + b;
        };
        System.out.println("Sum of numbers is:" + addNumber.sum(5, 6));
        System.out.println("Sum of numbers is:" + addNumber.sum(2, 6));

        System.out.println("---------------------------------------");
        FunctionalInterface3 strlength = (str) -> {
            return str.length();
        };
        System.out.println("length of the string is:" + strlength.getlength("Mango"));

    }
}
