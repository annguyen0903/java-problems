package chapter_8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Melon extends Fruit{
    private final String origin;

    public Melon(String type, int weight, String origin) {
        this.setType(type);
        this.setWeight(weight);
        this.origin = origin;
    }

    
}
