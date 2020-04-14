import java.sql.SQLOutput;

public class Bus extends PublicTransport {
    @Override
    void Signal() {
        super.Signal();
        System.out.println("Fa fa");
    }
}
