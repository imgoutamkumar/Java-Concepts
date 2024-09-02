package DesignPattern.BuilderDesignPattern;

public class UserMain {
    public static void main(String[] args) {
        User userObj1 = new User.UserBuilder("kumargoutam", "goutam@gmail.com", "password")
                .build();
        User userObj2 = new User.UserBuilder("kumarsiddharth", "siddharth@gmail.com", "password")
                .setAddress("Dhanbad")
                .build();

        System.out.println("userObj1 : " + userObj1);
        System.out.println("userObj2 : " + userObj2);
    }
}
