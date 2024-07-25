package package_1.keyboard;

public class Keyboard {
    private KeyboardType keyboardType;
    private KeyboardLighting keyboardLighting;
    private double weight;

    public Keyboard(KeyboardType keyboardType, KeyboardLighting keyboardLighting, double weight) {
        this.keyboardType = keyboardType;
        this.keyboardLighting = keyboardLighting;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public KeyboardLighting getKeyboardLighting() {
        return keyboardLighting;
    }

    public void setKeyboardLighting(KeyboardLighting keyboardLighting) {
        this.keyboardLighting = keyboardLighting;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", keyboardLighting=" + keyboardLighting +
                ", weight=" + weight +
                '}';
    }
}
