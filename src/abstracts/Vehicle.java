package abstracts;

public abstract class Vehicle {
    double value;

    public Vehicle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double calculateValue();
}
