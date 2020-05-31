import org.w3c.dom.ls.LSOutput;

class HybridCar extends Car implements Tankable, Chargable {
    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println(" Car "+ getManufacturer() +  getModel() +" will be charged!");


    }

    @Override
    public void tank() {
        System.out.println(" Car "+ getManufacturer() +  getModel() +" will be tanked!");


    }
}
