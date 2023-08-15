package src.tmp;

import java.util.Objects;

public class NullCheckingV2 {
    public NullCheckingV2(String name, String color) {
        Objects.requireNonNull(name, "Name must not be null");
        Objects.requireNonNull(color, "Color must not be null");
    }

    public void assignDriver(String license, String location) {
        Objects.requireNonNull(license, "License cannot be null");
        Objects.requireNonNullElse(location, "Location cannot be null");
    }
}
