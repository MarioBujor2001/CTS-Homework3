package concrete;

import abstracts.Engine;

public class CombustionEngine extends Engine {

    public CombustionEngine(int power) {
        super(power);
    }

    @Override
    public void fillUp() {
        System.out.println("Combustion engine now has gas");
    }

    @Override
    public void start() {
        System.out.println("Combustion engine is now on ! brrrrr");
    }

    @Override
    public void stop() {
        System.out.println("Combustion engine in now off ! so quiet");
    }
}
