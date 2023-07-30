package src;

import java.util.Objects;

public class NullCheckingV4 {
    private final String name;
    private final String color;

    // In constructors, there is a typical approach to throw NullPointerException
    // when
    // the references provided are null.
    public NullCheckingV4(String name, String color) {
        this.name = MyObjectsV2.requireNonNullOrElse(name, "");
        this.color = MyObjectsV2.requireNonNullOrElse(color, "");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

class MyObjectsV2 {

    public static <T> T requireNonNullOrElse(T actualValue, T defaultValue) {
        if (Objects.nonNull(actualValue)) {
            return actualValue;
        } else {
            return Objects.requireNonNull(defaultValue, "default object must be non null");
        }
    }

}
