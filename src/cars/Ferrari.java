package cars;

public class Ferrari extends Car{
    @Override
    public void speed() {
        System.out.println("Ferrari Speed: 300 km/h");
    }

    @Override
    public void color() {
        System.out.println("Ferrari Color: Red");
    }
}
