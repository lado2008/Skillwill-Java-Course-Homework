import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mersedes", "E63S", 2022, 4);
        System.out.println(car);

        System.out.println(stringToInt("22"));
    }
    public static int stringToInt(String number) {
        return Integer.parseInt(number);
    }
}
