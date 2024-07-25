import package_1.*;
import package_1.arithmetic_calculator.ArithmeticCalculator;
import package_1.arithmetic_calculator.Operation;
import package_1.harddrive.HardDrive;
import package_1.harddrive.HardDriveType;
import package_1.keyboard.Keyboard;
import package_1.keyboard.KeyboardLighting;
import package_1.keyboard.KeyboardType;
import package_1.monitor.Monitor;
import package_1.monitor.MonitorType;
import package_1.processor.Processor;
import package_1.processor.ProcessorCoreCount;
import package_1.processor.ProcessorFrequency;
import package_1.processor.ProcessorMaker;
import package_1.ram.Ram;
import package_1.ram.RamSize;
import package_1.ram.RamType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите 1 число: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите 2 число: ");
        double b = new Scanner(System.in).nextDouble();

        ArithmeticCalculator ac = new ArithmeticCalculator(a, b);

        System.out.println("Результат сложения: " + ac.calculate(Operation.ADD));
        System.out.println("Результат вычитания: " + ac.calculate(Operation.SUBTRACT));
        System.out.println("Результат умножения: " + ac.calculate(Operation.MULTIPLY));

        Processor processor = new Processor(ProcessorFrequency.FREQ_2_4HHZ, ProcessorCoreCount.CORE_6, ProcessorMaker.INTEL, 456.8);
        Ram ram = new Ram(RamType.DDR3, RamSize.RAM_16GB, 342.5);
        HardDrive hardDrive = new HardDrive(HardDriveType.HDD, 512, 416.3);
        Monitor monitor = new Monitor(32, MonitorType.IPS, 953);
        Keyboard keyboard = new Keyboard(KeyboardType.CRK, KeyboardLighting.GAMER_L, 312);
        Computer computer = new Computer(processor, ram, hardDrive, monitor, keyboard);

        System.out.println(computer);
        System.out.println("\nОбщий вес компьютера составляет " + computer.calculateWeight() + " гр.");

    }
}