package package_1;

import package_1.harddrive.HardDrive;
import package_1.keyboard.Keyboard;
import package_1.monitor.Monitor;
import package_1.processor.Processor;
import package_1.ram.Ram;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private Monitor monitor;
    private Keyboard keyboard;

    public static final String vendor = "Dell";
    public static final String name = "Cool Dragon";

    public Computer(Processor processor, Ram ram, HardDrive hardDrive, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public Computer() {
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double calculateWeight() {
        return processor.getWeight() + ram.getWeight() + hardDrive.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                '}';
    }
}
