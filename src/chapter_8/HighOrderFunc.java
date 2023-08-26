package chapter_8;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighOrderFunc {

    public List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream().filter(predicate).collect(Collectors.toList());
    }

    public Predicate<String> getValidPredicate() {
        return s -> (s != null && s.contains("a"));
    }

    public List<String> upperCase(List<String> strings, UpperCaseFunc upperCaseFunc) {
        return strings.stream().filter(s -> s != null)
                .map(t -> upperCaseFunc.convert(t)).collect(Collectors.toList());
    }

    public Function<String, String> convertString(
            Function<String, String>... functions) {
        Function<String, String> result = Stream.of(functions)
                .reduce(Function.identity(), Function::andThen);
        return result;
    }

}
