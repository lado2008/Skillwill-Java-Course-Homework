package cars;

public abstract class Car {
    public abstract void speed();
    public abstract void color();

    public void numberOfWheels() {
        System.out.println("This car has 4 wheels.");
    }
}
