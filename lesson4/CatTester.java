public class CatTester {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        System.out.println(tom.isHungry());
        tom.eat("milk");
        System.out.println(tom.isHungry());
        tom.sleep(5);
        System.out.println(tom.isHungry());
        tom.eat("meat");
        System.out.println(tom.isHungry());
tom.eat("meat");
tom.eat("milk" );



    }
}

