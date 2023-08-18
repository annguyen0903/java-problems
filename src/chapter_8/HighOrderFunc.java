package src.chapter_8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HighOrderFunc {

    public List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream().filter(predicate).collect(Collectors.toList());
    }

    public Predicate<String> getValidPredicate() {
        return s -> (s != null && s.contains("a"));
    }

    public List<String> upperCase(List<String> strings, UpperCaseFunc upperCaseFunc) {
        return strings.stream().filter(s -> s!=null)
            .map(t -> upperCaseFunc.convert(t)).collect(Collectors.toList());
    }

}
