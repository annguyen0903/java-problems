package src.tmp;

import java.util.Collections;
import java.util.List;

public class SortingArrayStrings {

    public List<String> sortStringByLength(final List<String> listStrings) {
        Collections.sort(listStrings, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        
        //listStrings.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        return listStrings;

        //return listStrings.stream()
        //    .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
        //    .collect(Collectors.toList());
    }

}
