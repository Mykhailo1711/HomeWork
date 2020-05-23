import java.util.Objects;

public class Part {
    private int partNumber;
    private String brand;
    private String name;

    public Part(int partNumber, String brand, String name) {
        this.partNumber = partNumber;
        this.brand = brand;
        this.name = name;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partNumber=" + partNumber +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        if (another == null || getClass() != another.getClass()) return false;
        Part part = (Part) another;
        return partNumber == part.partNumber &&
                Objects.equals(brand, part.brand) &&
                Objects.equals(name, part.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNumber, brand, name);
    }
}
