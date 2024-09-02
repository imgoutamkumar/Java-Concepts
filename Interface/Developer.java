package Interface;

public interface Developer {

    // variable should be declared(or by default) as public static and final
    // if you initilize a variable then it's complusory to define its value

    // default method
    default void init() {
        System.out.println("This is default method for all developer no need to implement it manually.");
    };

    // abstract method
    // In interface if u haven't declare any specifier by defalt it is public and
    // abstract
    void develop();

    // static method
    // cannot override and only belong to class
    // so you have define it here
    static void assemble() {
        System.out.println("This is static method and cannot be overridden.");
    };
}
