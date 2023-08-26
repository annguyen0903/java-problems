package chapter_8;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Banana extends Fruit{

    public Banana(String type, int weight) {
        this.setType(type);
        this.setWeight(weight);
    }

}
