package test;

public class MutableClazz {
    public MutableClazz(String data) {
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MutableClazz clone() {
        return new MutableClazz(this.data);
    }
    
    private String data;
}
