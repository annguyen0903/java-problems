package test;

import java.util.Objects;

public class IndexCheckerV2 {

    private Integer length;

    public IndexCheckerV2(Integer length) {
        this.length = length;
    }

    public void inRange(Integer index) {
        // if (index < 0 || index >= length) {
        //     throw new IndexOutOfBoundsException();
        // }
        Objects.checkIndex(index, length);
    }

    public void inRange(int start, int end) {
        // if(start < 0 || end > length) {
        //     throw new IndexOutOfBoundsException();
        // }
        Objects.checkFromToIndex(start, end, length);
    }

}
