package concrete;

import abstracts.Engine;
import abstracts.Vehicle;
import interfaces.IOpenDoors;
import interfaces.IRefillable;
import interfaces.IStartEngine;
import interfaces.IStopEngine;

public class Truck extends Vehicle implements IRefillable, IOpenDoors, IStartEngine, IStopEngine {

    private Engine engine;

    public Truck(double value, Engine engine) {
        super(value);
        this.engine = engine;
    }



    @Override
    public double calculateValue() {
        return this.getValue() *0.9;
    }

    @Override
    public void openDoors() {
        System.out.println("All 4 dors opened");
    }

    @Override
    public void refil() {
        System.out.println("Truck refilled");
        engine.fillUp();
    }

    @Override
    public void startEngine() {
        System.out.println("Truck started");
        engine.start();
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck stopped");
        engine.stop();
    }
}
