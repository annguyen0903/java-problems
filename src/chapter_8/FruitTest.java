package chapter_8;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FruitTest {
    @Test
    public void testFilterByType(){
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("A", 100, "AB"));
        melons.add(new Melon("A", 80, "AA"));
        melons.add(new Melon("B", 110, "CC"));
        melons.add(new Melon("C", 70, "CA"));
        melons.add(new Melon("B", 120, "AA"));
        melons.add(new Melon("D", 104, "CA"));
        melons.add(null);
        //var specificFilter = new FilterType("A");
        //List<Melon> filteredMelons = MelonFilter.filter(specificFilter, melons);

        // List<Melon> filteredMelons = MelonFilter.filter(new FilterPredicate() {
        //     @Override
        //     public boolean filter(Melon melon) {
        //         if (melon == null) return false;
        //         if (melon.getType().equals("A")){
        //             return true;
        //         } else {
        //             return false;
        //         }
        //     }
        // }, melons);

        List<Melon> filteredMelons = FruitFilter.filter(melon -> 
            (melon!=null && "A".equals(melon.getType())), melons); 
        assertTrue(filteredMelons.size() == 2);
        assertTrue(filteredMelons.get(0).getType().equals("A"));
        assertTrue(filteredMelons.get(1).getType().equals("A"));
    }

    @Test
    public void testFilterByWeight(){
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("A", 100, "AB"));
        melons.add(new Melon("A", 80, "AA"));
        melons.add(new Melon("B", 110, "CC"));
        var tmp = new Melon("C", 70, "CA");
        melons.add(tmp);
        melons.add(new Melon("B", 120, "AA"));
        melons.add(new Melon("D", 104, "CA"));
        melons.add(null);
        //var specificFilter = new FilterWeight(70, 100);
        //List<Melon> filteredMelons = MelonFilter.filter(specificFilter, melons);
        List<Melon> filteredMelons = FruitFilter.filter(melon -> 
            (melon!=null && melon.getWeight() >= 70 && melon.getWeight() <= 100), melons);
        assertTrue(filteredMelons.size() == 3);
        assertTrue(filteredMelons.contains(tmp));
    }

    @Test
    public void testFilterByTypeAndWeight(){
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("A", 100, "AB"));
        melons.add(new Melon("A", 80, "AA"));
        melons.add(new Melon("B", 110, "CC"));
        var tmp = new Melon("C", 70, "CA");
        melons.add(tmp);
        melons.add(new Melon("B", 120, "AA"));
        melons.add(new Melon("D", 104, "CA"));
        melons.add(null);
        // List<Melon> filteredMelons = MelonFilter
        //     .filterByTypeAndWeight("C", 70, 100, melons);
        List<Melon> filteredMelons = FruitFilter.filter(melon -> 
            (melon!=null &&
             "C".equals(melon.getType()) &&
             melon.getWeight() >= 70 &&
             melon.getWeight() <= 100), melons); 
        assertTrue(filteredMelons.size() == 1);
        assertTrue(filteredMelons.contains(tmp));
    }

    @Test
    public void testFilterByType_Melon_Banana(){
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Melon("A", 100, "AB"));
        fruits.add(new Melon("A", 80, "AA"));
        fruits.add(new Melon("B", 110, "CC"));
        fruits.add(new Banana("C", 70));
        fruits.add(new Melon("B", 120, "AA"));
        fruits.add(new Melon("D", 104, "CA"));
        fruits.add(null);

        List<Fruit> filteredFruits = FruitFilter.filter(fruit -> 
            (fruit!=null && "A".equals(fruit.getType())), fruits); 
        assertTrue(filteredFruits.size() == 2);
        assertTrue(filteredFruits.get(0).getType().equals("A"));
        assertTrue(filteredFruits.get(1).getType().equals("A"));
    }
}
