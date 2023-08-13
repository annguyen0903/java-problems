package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorter {

    public void sortNaturalByKey(HashMap<Integer, String> map1) {
        //default sorting mode, do nothing
    }

    public Map<Integer, String> sortReverseByKey(Map<Integer, String> map1) {
       var sortedStreamEntries = map1.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()));
       var sortedMap = sortedStreamEntries.collect(
        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
        return sortedMap;
    }

    public <K, V extends Comparable<? super V>> Map<K,V> sortNaturalByValue(Map<K, V> map1) {
        var sortedStreamEntries = map1.entrySet().stream()
            .sorted(Map.Entry.comparingByValue());
        var sortedMap = sortedStreamEntries
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
        return sortedMap;
    }

    public <K, V extends Comparable<? super V>> Map<K,V> sortReverseByValue(Map<K, V> map1) {
        var sortedStreamEntries = map1.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        var sortedMap = sortedStreamEntries
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
        return sortedMap;
    }

    public <K,V extends Comparable<? super V>> Map<K,V> sortNaturalByValueObject(Map<K,V> map1) {
        var sortedStreamEntries = map1.entrySet().stream()
        .sorted(Map.Entry.comparingByValue());
        var sortedMap = sortedStreamEntries
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
        return sortedMap;
    }

    static class Task implements Comparable<Task>{
        private Integer id;
        private String name;
        public Task(int i, String string) {
            id = i;
            name = string;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public int compareTo(Task o) {
            //Integer.compare(this.id, o.id);
            return this.name.compareToIgnoreCase(o.name);
            //return this.id.compareTo(o.id);
        }
    }

}
