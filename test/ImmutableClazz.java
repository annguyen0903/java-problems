package test;

public final class ImmutableClazz {
    public ImmutableClazz(String data) {
        this.data = data;
    }

    public String getData(){
        return data;
    }

    // public void setData(String data) {
    //     this.data = data;
    // }

    private final String data;
}
