package DesignPattern.BuilderDesignPattern;

public class User {
    // mandatory field
    private String username;
    private String email;
    private String password;

    // optional field
    private String address;
    private int phoneNo;

    public User(UserBuilder userBuilder) {
        this.username = userBuilder.username;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.address = userBuilder.address;
        this.phoneNo = userBuilder.phoneNo;
    }

    @Override
    public String toString() {
        return this.username + " " + this.email + " " + this.password + " " + this.address + " " + this.phoneNo;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String gePassword() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPhoneNo() {
        return this.phoneNo;
    }

    public static class UserBuilder {
        // mandatory field
        private String username;
        private String email;
        private String password;

        // optional field
        private String address;
        private int phoneNo;

        // public constructor with mandatory field
        public UserBuilder(String username,
                String email,
                String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        // setter methods for optional field
        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNo(int phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        // build method User object
        public User build() {
            return new User(this);
        }
    }
}
