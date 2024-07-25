package package_1.harddrive;

public class HardDrive {
    private HardDriveType hardDriveType;
    private int size;
    private double weight;

    public HardDrive(HardDriveType hardDriveType, int size, double weight) {
        this.hardDriveType = hardDriveType;
        this.size = size;
        this.weight = weight;
    }

    public HardDriveType getHardDriveType() {
        return hardDriveType;
    }

    public void setHardDriveType(HardDriveType hardDriveType) {
        this.hardDriveType = hardDriveType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "hardDriveType=" + hardDriveType +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
