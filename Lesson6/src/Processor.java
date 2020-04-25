import java.util.Objects;

class Processor implements Cloneable {
    private String name;
    private int frequency;
    private int numberOfCores;

    Processor(String name, int frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                '}';
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    @Override
    protected Processor clone() throws CloneNotSupportedException {
        return (Processor) super.clone();
    }
}
