package package_1;


public class Processor {
    private ProcessorFrequency processorFrequency;
    private ProcessorCoreCount processorCoreCount;
    private ProcessorMaker processorMaker;
    private double weight;

    public Processor(ProcessorFrequency processorFrequency, ProcessorCoreCount coreCount, ProcessorMaker processorMaker, double weight) {
        this.processorFrequency = processorFrequency;
        this.processorCoreCount = coreCount;
        this.processorMaker = processorMaker;
        this.weight = weight;
    }

    public ProcessorFrequency getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(ProcessorFrequency processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public ProcessorCoreCount getProcessorCoreCount() {
        return processorCoreCount;
    }

    public void setProcessorCoreCount(ProcessorCoreCount processorCoreCount) {
        this.processorCoreCount = processorCoreCount;
    }

    public ProcessorMaker getProcessorMaker() {
        return processorMaker;
    }

    public void setProcessorMaker(ProcessorMaker processorMaker) {
        this.processorMaker = processorMaker;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processorFrequency=" + processorFrequency +
                ", coreCount=" + processorCoreCount +
                ", processorMaker=" + processorMaker +
                ", weight=" + weight +
                '}';
    }
}
