
public class Cat {

    private String name;
  

    public Cat(String name) {

        this.name = name;
    }
    public void eat(String mealName) {

        System.out.println(name + " eats " + mealName);

    }
    public void play(String toyName){
        System.out.println(name +" plays with " + toyName);

    }

public void sleep(int amountOfHours){
    System.out.println(name + " going to sleep " + amountOfHours + " hours");

}
public void isHungry(){
    System.out.println(name+ " is hungry");
}

public void notHungry(){
        System.out.println(name + " fed up");
    }

public void sayMeow(){
    System.out.println(name + " say MEOW");
}
}