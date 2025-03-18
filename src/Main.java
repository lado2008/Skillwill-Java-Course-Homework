import cars.BMW;
import cars.Car;
import cars.Ferrari;
import hello.HelloClass;

public class Main {
    public static void main(String[] args) {
        HelloClass hello = new HelloClass();
        hello.hello("Hello World!");
        hello.hello("Hi, I am Lado :)", 3);

        Car bmw = new BMW();
        bmw.speed();
        bmw.color();
        bmw.numberOfWheels();

        Car ferrari = new Ferrari();
        ferrari.speed();
        ferrari.color();
        ferrari.numberOfWheels();
    }
}