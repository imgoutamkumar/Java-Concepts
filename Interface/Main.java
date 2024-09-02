package Interface;

public class Main {
    public static void main(String[] args) {
        Developer androidDeveloper = new AndroidDeveloper();
        Developer webDeveloper = new WebDeveloper();
        IosDeveloper iosDeveloper = new IosDeveloper();

        androidDeveloper.develop();

        // calling overridden method
        androidDeveloper.init();

        webDeveloper.develop();

        // calling default initilized method
        webDeveloper.init();

        iosDeveloper.develop();

        // calling default initilized method
        iosDeveloper.init();

        // calling static method
        Developer.assemble();
    }
}
