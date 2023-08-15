package src.tmp;

import java.util.Arrays;
import java.util.Collections;

public class ReversingArray {

    private Object[] objects;

    public ReversingArray(Object ... objects) {
        this.objects = objects;
    }

    public Object[] reverse() {
        // final int arrLength = objects.length;
        // Object[] reversedArr = new Object[arrLength];
        // for(int i=0; i<arrLength; i++) {
        //     reversedArr[arrLength-i-1] = objects[i];
        // }
        // return reversedArr;

        var inputList = Arrays.asList(objects);
        Collections.reverse(inputList);
        return inputList.toArray();
    }

}
