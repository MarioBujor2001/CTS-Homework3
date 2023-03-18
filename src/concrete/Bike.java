package concrete;

import abstracts.Vehicle;
import interfaces.IRideable;

public class Bike extends Vehicle implements IRideable {
    public Bike(double value) {
        super(value);
    }

    @Override
    public double calculateValue() {
        return 0;
    }

    @Override
    public void ride() {
        System.out.println("Riding the bike");
    }
}
