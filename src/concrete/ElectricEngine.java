package concrete;

import abstracts.Engine;

public class ElectricEngine extends Engine {
    public ElectricEngine(int power) {
        super(power);
    }

    @Override
    public void fillUp() {
        System.out.println("Electric engine now has power");
    }

    @Override
    public void start() {
        System.out.println("Electric engine is now on ! bzbzbzbz");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine in now off ! so quiet");
    }
}
