class ElectricCar extends Car implements Chargable {
    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);

    }

    @Override
    public void charge() {
        System.out.println("Car will be charged");
    }
}
