package src.tmp;

import java.util.List;
import java.util.Objects;

public class NullChecking {
    public static int sumIntegers(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
                .filter(i -> i != null)
                .mapToInt(Integer::intValue).sum();
    }

    public static int sumIntegersV2(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers) {
        if (integers == null) {
            return false;
        }
        return integers.stream()
                .anyMatch(i -> i == null);
    }

    public static boolean integersContainsNullsV2(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return false;
        }
        return integers.stream()
                .anyMatch(Objects::isNull);
    }

    //TODO: refine all (x == null) or (x != null) by Objects.isNull() or Objects.nonNull()
}
