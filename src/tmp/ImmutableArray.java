package src.tmp;

import java.util.Objects;

public final class ImmutableArray {

    private final Task[] objects;

    public ImmutableArray(Task ...objects) throws CloneNotSupportedException {
        if (Objects.isNull(objects)) {
            this.objects = objects;
        } else {
            this.objects = new Task[objects.length];
            for (int i=0; i<objects.length; i++) {
                this.objects[i] = objects[i].clone();
            }
        }
    }

    public int size() {
        return objects.length;
    }

    public Task get(int idx) throws CloneNotSupportedException {
        if(Objects.isNull(objects)) {
            throw new ArrayIndexOutOfBoundsException("Empty array");
        }
        if (idx < 0 || idx >= objects.length) {
            throw new ArrayIndexOutOfBoundsException("Out of boundary");
        }
        return objects[idx].clone();
    }
    //TODO: implement general array type not just for task
}
