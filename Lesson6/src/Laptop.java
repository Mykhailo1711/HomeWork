import java.util.Objects;

public class Laptop implements Cloneable {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int weight;
    private int ramAmount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                ", ramAmount=" + ramAmount +
                '}';
    }
    @Override
    protected Laptop clone() throws CloneNotSupportedException {
        Laptop clone = (Laptop) super.clone();
        clone.processor = this.processor.clone();
        clone.hardDrive = this.hardDrive.clone();

        return clone;
    }
}
