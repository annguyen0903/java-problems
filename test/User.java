package test;

public final class User {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final Integer age;
    private final String phone;
    private final String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        String userInfo = firstName + " " + middleName + " " + lastName +
            " " + age + " " + phone + " " + address;
        return userInfo;
    }

    public static final class UserBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private Integer age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User newUser = new User(this);
            return newUser;
        }
    }
}
