package test;

import org.junit.Test;

public class ImmutableBuilderTest {
    @Test
    public void test() {
        var userAn = new User.UserBuilder("An", "Nguyen")
            .middleName("Thanh")
            .age(33)
            .address("Quan Hoa, Cau Giay, HN")
            .build();
        System.out.println(userAn.toString());

        var userHuyen = new User.UserBuilder("Huyen", "Tran")
            .age(32)
            .address("Quan Hoa, Cau Giay, HN")
            .build();
        System.out.println(userHuyen.toString());

        var strBuilder = new StringBuilder();
        strBuilder.append("helo").append(4).append(true).toString();
        //TODO: Investigate builder pattern in Java
    }
}
