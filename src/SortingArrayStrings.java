package src;

import java.util.List;

public class SortingArrayStrings {

    public List<String> sortStringByLength(List<String> listStrings) {
        //Collections.sort(null, null);
        listStrings.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        //listStrings.add("null");
        return listStrings;
        //return listStrings.stream()
        //    .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
        //    .collect(Collectors.toList());
    }

}
