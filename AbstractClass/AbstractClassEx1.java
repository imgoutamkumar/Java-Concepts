package AbstractClass;

abstract class A {

    // variable could be declare anything in abstract class

    abstract void getSallaryInfo();

    abstract void getEmployeeInfo();

    void notAbstractMethod() {
        System.out.println("Not abstract method");
    };

}

class B extends A {

    void getSallaryInfo() {
        System.out.println("Sallary Info Working");
    }

    void getEmployeeInfo() {
        System.out.println("Employee Info Working");
    }
}

public class AbstractClassEx1 {
    public static void main(String[] args) {
        A object1 = new B();
        object1.getSallaryInfo();
        object1.notAbstractMethod();
    }
}
