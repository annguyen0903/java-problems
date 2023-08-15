package src.tmp;

public class String2NumConverter {
    private String input;

    public String2NumConverter(String input) {
        this.input = input;
    }

    public int parseInt() {
        return Integer.parseInt(input);
    }

    public long parseLong() {
        return Long.parseLong(input);
    }

    public float parseFloat() {
        return Float.parseFloat(input);
    }

    public double parseDouble() {
        return Double.parseDouble(input);
    }

}
