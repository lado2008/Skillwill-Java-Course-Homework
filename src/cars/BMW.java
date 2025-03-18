package cars;

public class BMW extends Car{

    @Override
    public void speed() {
        System.out.println("BMW Speed: 200 km/h");
    }

    @Override
    public void color() {
        System.out.println("BMW Color: Black");
    }
}
