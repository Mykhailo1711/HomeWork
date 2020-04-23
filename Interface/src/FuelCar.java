 class FuelCar extends Car implements Tankable {

    public FuelCar(String manufacturer, String model) {
        super(manufacturer, model);

    }

     @Override
     public void tank() {
         System.out.println("Car will be tanked");
     }
 }
