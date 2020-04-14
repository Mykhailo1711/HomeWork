

public class Car extends Transport {
    @Override
    void Signal() {
        super.Signal();
        System.out.println("Bip bip");
    }
}
