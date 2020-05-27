public class CarTester {
    public static void main(String[] args) {
        FuelCar fuelCar = new FuelCar("Vaz", "2101");
        ElectricCar electricCar = new ElectricCar("Nissan", "Leaf");
        HybridCar hybridCar = new HybridCar("Toyota", "Prius");
        FuelCar fuelCar2 = new FuelCar("Ford", "Focus");


        Car[] arrayOfCars = {fuelCar, electricCar, hybridCar, fuelCar2};
        for (Car car : arrayOfCars) {
            if (car instanceof Tankable) {
                ((Tankable) car).tank();

            }
            if (car instanceof Chargable) {
                ((Chargable) car).charge();

            }


        }
    }


}








