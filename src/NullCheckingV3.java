package src;

import java.util.Objects;

public class NullCheckingV3 {
    private final String name;
    private final String color;
    private Object location;
    private String license;

    // In constructors, there is a typical approach to throw NullPointerException
    // when
    // the references provided are null.
    public NullCheckingV3(String name, String color) {
        this.name = Objects.requireNonNull(name, "Name must not be null");
        this.color = Objects.requireNonNull(color, "Color must not be null");
    }

    // In methods some developers will prefer to return an inoffensive
    // result or to throw IllegalArgumentException.
    public void assignDriver(String license, String location) {
        // this.license = Objects.requireNonNull(license, "License cannot be null");
        // this.location = Objects.requireNonNullElse(location, "Location cannot be
        // null");

        // this.license = MyObjects.requireNonNullElseThrowsIAE(license, "License cannot
        // be null");
        // this.location = MyObjects.requireNonNullElseThrowsIAE(location, "Location
        // cannot be null");

        this.license = MyObjects.requireNonNullElseThrows(license, new IllegalArgumentException());
        this.location = MyObjects.requireNonNullElseThrows(location, new IllegalArgumentException("cannot be null"));
    }
}

class MyObjects {

    public static <T> T requireNonNullElseThrowsIAE(T value, String warningMsg) {
        if (Objects.isNull(value)) {
            throw new IllegalArgumentException(warningMsg);
        }
        return value;
    }

    public static <T, X extends Throwable> T requireNonNullElseThrows(
            T value, X expClass) throws X {
        if (Objects.isNull(value)) {
            throw expClass;
        }
        return value;
    }

}
