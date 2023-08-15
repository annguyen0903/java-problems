package src.tmp;

import java.util.HashMap;
import java.util.Map;

public class MapMerging {
    public <K, V> Map<K, V> merge(Map<K, V> map1, Map<K, V> map2) {
        var result = new HashMap<K, V>();
        //copy map1 to result
        for (Map.Entry<K, V> entry : map1.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        //copy map2 to result
        for (Map.Entry<K, V> entry : map2.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        // var result = new HashMap<K, V>(map1);
        // map2.forEach((k, v) -> {
        //     result.merge(k, v, (v1, v2) -> v2);
        // });
        return result;
    }
}
