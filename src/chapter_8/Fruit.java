package chapter_8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Fruit {
    private String type;
    private int weight;
}
