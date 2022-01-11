package components;

public class Battery {

    private int size;
    private String make;

    public Battery(int size, String make) {
        this.size = size;
        this.make = make;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
