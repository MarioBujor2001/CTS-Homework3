package concrete;

import abstracts.Engine;
import abstracts.Vehicle;
import interfaces.IOpenDoors;
import interfaces.IRefillable;
import interfaces.IStartEngine;
import interfaces.IStopEngine;

public class Car extends Vehicle implements IRefillable, IOpenDoors, IStartEngine, IStopEngine {

    private Engine engine;

    public Car(double value, Engine engine) {
        super(value);
        this.engine = engine;
    }

    @Override
    public double calculateValue() {
        return this.getValue() * 0.8;
    }

    @Override
    public void openDoors() {
        System.out.println("All 4 dors opened");
    }

    @Override
    public void refil() {
        System.out.println("Car refilled");
        engine.fillUp();
    }

    @Override
    public void startEngine() {
        System.out.println("Car started");
        engine.start();
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopped");
        engine.stop();
    }
}
