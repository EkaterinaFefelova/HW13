package package_1;

public class Ram {
    private RamType ramType;
    private RamSize ramSize;
    private double weight;

    public Ram(RamType ramType, RamSize ramSize, double weight) {
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.weight = weight;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }

    public RamSize getRamSize() {
        return ramSize;
    }

    public void setRamSize(RamSize ramSize) {
        this.ramSize = ramSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "ramType=" + ramType +
                ", ramSize=" + ramSize +
                ", weight=" + weight +
                '}';
    }
}
