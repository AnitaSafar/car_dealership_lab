package components;

public class SteeringWheel {

    private int size;
    private String material;

    public SteeringWheel(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
