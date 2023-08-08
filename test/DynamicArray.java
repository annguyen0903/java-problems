package test;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray {

    private Object[] objects=null;
    private int size=0;

    public DynamicArray(Object ... objects) {
        this.objects = objects;
        size = objects.length;
    }

    public int size() {
        if (Objects.isNull(objects)) {
            return 0;
        }
        return size;
    }

    public void add(Object newItem) {
        if(Objects.isNull(objects)) {
            objects = new Object[1];
            objects[0] = newItem;
        } else {
            int capacitySize = objects.length;
            if((capacitySize-size)==0) {
                //extend array by one unit
                objects = Arrays.copyOf(objects, objects.length+1);
            }
            objects[size] = newItem;
        }
        size++;
    }

    public int capacitySize() {
        if(Objects.isNull(objects)) {
            return 0;
        }
        return objects.length;
    }

    public Object get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new ArrayIndexOutOfBoundsException("out of arrays boundary");
        }
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("array is empty");
        }
        return objects[idx];
    }

    public void increaseCapacityBy(int extendSize) {
        objects = Arrays.copyOf(objects, objects.length+extendSize);
    }

    //TODO: re-read implementation of ArrayList
}
