package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MinMaxArray {
        
    final private int[] numArr;

    public MinMaxArray(int ... numArr) {
        this.numArr = numArr;
    }

    public Integer min() {
        var minOpt = IntStream.of(numArr).min();
        if (minOpt.isPresent()) {
            return minOpt.getAsInt();
        } else {
            return null;
        }
    }

    public Object max() {
        //TODO find max by filter
        return null;
    }

}
