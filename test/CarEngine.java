package test;

public class CarEngine {
    private String engineName;
    public CarEngine(String engineName) {
        this.engineName = engineName;
    }
    public String getName() {
        return engineName;
    }
    public void setName(String newName) {
        this.engineName = newName;
    }
}
