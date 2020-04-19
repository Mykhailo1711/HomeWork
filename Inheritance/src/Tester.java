public class Tester {
    public static void main(String[] args) {
       Bus bus = new Bus();
       Car car = new Car();
       Train train = new Train();
       car.Signal();
       bus.Signal();
       train.Signal();

    }

public static void transportMakeSignal (Transport transport){
       transport.Signal();

}

}



