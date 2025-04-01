public class Car extends Vehicle{
    private int wheelCount;

    public Car(String brand, String modelName, int releaseYear, int wheelCount) {
        super(brand, modelName, releaseYear);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public String toString() {
        return "Car brand is " + getBrand() + ", model is " + getModelName() + ", release year is " + getReleaseYear() + ", the mounts of wheel are " + wheelCount;
    }
}
