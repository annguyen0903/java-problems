package test;

public final class ImmutableClazz {
    public ImmutableClazz(String data, MutableClazz mutableData) {
        this.data = data;
        this.mutableData = mutableData.clone();
    }

    public String getData(){
        return data;
    }

    // public void setData(String data) {
    //     this.data = data;
    // }

    private final String data;
    private final MutableClazz mutableData;

    public MutableClazz getMutableData() {
        return mutableData.clone();
    }
}
