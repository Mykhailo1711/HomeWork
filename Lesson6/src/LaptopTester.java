public class LaptopTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Processor intel = new Processor("Intel", 5, 4);
        HardDrive ssd = new HardDrive("SSD", "turbo", 4);
        Laptop acer = new Laptop("Acer", intel, ssd, 15, 3, 500);
        System.out.println(acer);
        System.out.println("++++++++++++++++++++++");
      Laptop clone =  acer.clone();
        System.out.println(clone);


    }
}
