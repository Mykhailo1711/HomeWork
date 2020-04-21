abstract class HybridCar extends Car implements Tankable,Chargable {
    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }
}
