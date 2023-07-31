package test;

import java.util.Objects;

public class IndexChecker {

    private Integer length;

    public IndexChecker(Integer length) {
        this.length = length;
    }

    public void inRange(Integer index) {
        // if (index < 0 || index >= length) {
        //     throw new IndexOutOfBoundsException();
        // }
        Objects.checkIndex(index, length);
    }

}
