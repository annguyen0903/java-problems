package chapter_8;

import java.util.List;
import java.util.stream.Collectors;

public class FruitFilter {
    // public static List<Melon> filterByType(String type, List<Melon> melons) {
    //     return melons.stream().filter(t -> (t!=null && t.getType().equals(type)))
    //         .collect(Collectors.toList());
    // }

    // public static List<Melon> filterByWeight(int minWeight, int maxWeight, List<Melon> melons) {
    //     return melons.stream()
    //         .filter(t -> (t!=null && (t.getWeight() >= minWeight) && (t.getWeight() <= maxWeight)))
    //         .collect(Collectors.toList());
    // }

    // public static List<Melon> filterByTypeAndWeight(
    //     String type, int minWeight, int maxWeight, List<Melon> melons) {
    //     return melons.stream().filter(t -> (t!=null && t.getType().equals(type) &&
    //      (t.getWeight() >= minWeight) && (t.getWeight() <= maxWeight)))
    //         .collect(Collectors.toList());
    // }

    public static <T> List<T> filter(FilterPredicate<T> specificFilter, List<T> fruits) {
        return fruits.stream().filter(t -> 
            specificFilter.filter(t)).collect(Collectors.toList());
    }
}
