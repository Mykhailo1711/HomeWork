public class CarTester {
    public static void main(String[] args) {


        Car car1 = new FuelCar("VAZ", "1") {
            @Override
            public void tank() {

            }
        };
        Car car2 = new ElectricCar("Nissan", "Leaf") {
            @Override
            public void charge() {

            }
        };
        Car car3 = new HybridCar("Toyota", "Prius") {
            @Override
            public void charge() {

            }

            @Override
            public void tank() {

            }
        };
       Car [] arrayOfCars = {car1, car2, car3};

        for (Car car:arrayOfCars) {
            if( car instanceof FuelCar ){
          ((FuelCar) car).tank();
                System.out.println("Car will be tanked");
            }
          if(car instanceof ElectricCar){
    ((ElectricCar) car).charge();
              System.out.println("Car will be charged");
}
        }

    }




    }
