import java.io.CharArrayReader;

public class Engine {
    private String name;
    private int horsepower;
    private  int capacity;
    private boolean isStarted = false;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;

    }

    public String getName() {
        return name;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCapacity() {
        return capacity;
    }
public boolean getStarted(){
        return isStarted;
}
    public void start() {

        if (!isStarted) {

            isStarted = true;

            System.out.println("Car  is starting " +getName()+ " engine");

            System.out.println(getName() + " engine has been started ");

        } else {

            System.out.println(getName() + " engine has been started already " );

        }

    }

    public void stop() {

        if (!isStarted) {

            System.out.println(getName() + " engine has been stopped already  " );

        } else {

            isStarted = false;

            System.out.println("Car  is stopping " + getName() + " engine");

            System.out.println(getName() + " engine has been stopped");

        }

    }
}

