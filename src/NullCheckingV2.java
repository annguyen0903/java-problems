package src;

import java.util.Objects;

public class NullCheckingV2 {
    private final String name;
    private final String color;
    private Object location;
    private String license;
    

    public NullCheckingV2(String name, String color) {
        // if (Objects.isNull(name)) {
        //     throw new NullPointerException("Car name cannot be null");
        // }
        // if (Objects.isNull(color)) {
        //     throw new NullPointerException("Car color cannot be null");
        // }
        // this.name = name;
        // this.color = color;
        this.name = Objects.requireNonNull(name, "Name must not be null");
        this.color = Objects.requireNonNull(color, "Color must not be null");
    }

    public void assignDriver(String license, String location) {
        // if (Objects.isNull(license)) {
        //     throw new NullPointerException("License cannot be null");
        // }
        // if (Objects.isNull(location)) {
        //     throw new NullPointerException("Location cannot be null");
        // }
        // this.license = license;
        // this.location = location;
        this.license = Objects.requireNonNull(license, "License cannot be null");
        this.location = Objects.requireNonNullElse(location, "Location cannot be null");
    }
}
