package src.tmp;

public class Car implements Cloneable{
    private String model;
    private String color;
    private CarEngine engine;

    public Car (String model, String color, CarEngine engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }

    public String getModel() {
        return this.model;
    }
    
    public String getColor() {
        return this.color;
    }

    public String getEngineName() {
        return this.engine.getName();
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
    }

    
}
