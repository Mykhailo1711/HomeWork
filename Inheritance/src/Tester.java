public class Tester {
    public static void main(String[] args) {
        Train train = new Train();
        train.Signal();

    }

public static void transportMakeSignal (Transport transport){
        if(transport instanceof Car){
            Car car = (Car) transport;
            car.Signal();
        }
if (transport instanceof Train){
    Train train =(Train) transport;
    train.Signal();
}

}


    }

