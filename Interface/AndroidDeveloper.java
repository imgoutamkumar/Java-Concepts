package Interface;

public class AndroidDeveloper implements Developer {

    @Override
    public void develop() {
        System.out.println("Android Developer");
    }

    @Override
    public void init() {
        System.out.println("Override init method for android developer");
    }

}
