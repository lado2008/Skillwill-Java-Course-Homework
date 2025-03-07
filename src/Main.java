import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        animals("dog");
        System.out.println(powerVerionOne(2, 4));
        System.out.println(powerVerionTwo(5, 3));
    }

    // Task 1
    static void animals(String animal) {
        if (animal == "dog") {
            System.out.println("I am the dog");
        } else if (animal == "cat") {
            System.out.println("I an the cat");
        }  else if (animal == "lion") {
            System.out.println("I an the lion");
        } else if (animal == "pig") {
            System.out.println("I an the pig");
        } else {
            System.out.println("I am an animal");
        }
    }
    // Task 2 Version One
    static int powerVerionOne(int x, int y) {
        int result = 1;
        int i = 0;

        while (i < y) {
            result *= x;
            i++;
        }
        return result;
    }
    // Task 2 Version Two
    static int powerVerionTwo(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}