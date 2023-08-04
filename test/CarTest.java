package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
    @Test
    public void testDeepCloneCar() throws CloneNotSupportedException{
        var engine = new CarEngine("V6");
        var car = new Car("Madza", "Red", engine);
        var clonedCar = car.clone();
        engine.setName("V7");
        assertEquals("", car.getModel(), clonedCar.getModel());
        assertEquals("", car.getEngineName(), clonedCar.getEngineName());

        //TODO: implement clone via serialization
        //Try to clone list of objects?
        
    }
}
