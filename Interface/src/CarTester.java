public class CarTester {
    public static void main(String[] args) {
FuelCar car1 = new FuelCar("Vaz","1");
ElectricCar car2 = new ElectricCar("Nissan","Leaf");
HybridCar car3 = new HybridCar("Toyota","Prius");

Car [] arrayOfCars = {car1, car2, car3};
        for (Car car:arrayOfCars) {
if(car instanceof FuelCar) {
    ((FuelCar) car).tank();
}
if (car instanceof ElectricCar ) {
    ((ElectricCar) car).charge();
}

        }


}
        }







