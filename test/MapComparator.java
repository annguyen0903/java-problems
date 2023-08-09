package test;

import java.util.HashMap;
import java.util.Objects;

public class MapComparator {

    public boolean compareEqual(HashMap<Integer, String> map1,
         HashMap<Integer, String> map2) {
        if(map1 == map2) {
            return true;
        }

        if(Objects.isNull(map1) ||
        Objects.isNull(map2)) {
            return false;
        }

        if(map1.size() != map2.size()) {
            return false;
        }

        for (var entry: map1.entrySet()) {
            if(map2.containsKey(entry.getKey())) {
                String map2Val = map2.get(entry.getKey());
                //TODO: what if one of value null?
                if(!map2Val.equals(entry.getValue())) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;

    }

}
