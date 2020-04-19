public class Cat {

    private String name;
    private boolean hungry;


    public Cat(String name) {
        this.name = name;
        this.hungry= true;
    }

    public void eat(String meal) {

        if (hungry){
            System.out.println(name + " eats " + meal);
            hungry = false;
        }else {
            System.out.println(name + "is not hungry");
        }

    }

    public void play(String toyName){
        System.out.println(name +" plays with " + toyName);

    }

    public void sleep(int amountOfHours){
        System.out.println(name + " going to sleep " + amountOfHours + " hours");
        hungry = true;

    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }
}
