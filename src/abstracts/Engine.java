package abstracts;

public abstract class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public abstract void fillUp();
    public abstract void start();
    public abstract void stop();
}
