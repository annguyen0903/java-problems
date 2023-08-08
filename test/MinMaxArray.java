package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxArray {
        
    final private int[] numArr;

    public MinMaxArray(int ... numArr) {
        this.numArr = numArr;
    }

    public Integer min() {
        var minOpt = IntStream.of(numArr).min();
        if (minOpt.isPresent()) {
            return minOpt.getAsInt();
        }
        return null;
    }

    public Integer max() {
        var maxOpt = IntStream.of(numArr).max();
        if (maxOpt.isPresent()) {
            return maxOpt.getAsInt();
        }
        return null;
    }

    public double avg() {
        var avgOpt = IntStream.of(numArr).average();
        if (avgOpt.isPresent()) {
            return avgOpt.getAsDouble();
        }
        return 0.0;
    }

    //TODO: using comparator

}
