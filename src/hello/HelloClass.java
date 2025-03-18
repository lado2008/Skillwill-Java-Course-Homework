package hello;

public class HelloClass implements HelloInterface{
    @Override
    public void hello(String message) {
        System.out.println(message);
    }

    @Override
    public void hello(String message, int digit) {
        for (int i = 0; i < digit; i++) {
            System.out.println(message);
        }
    }
}
