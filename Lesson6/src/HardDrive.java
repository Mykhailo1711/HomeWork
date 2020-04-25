import java.util.Objects;

public class HardDrive implements Cloneable {
    private String name;
    private String type;
    private int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected HardDrive clone() throws CloneNotSupportedException {
        return (HardDrive) super.clone();
    }
}
