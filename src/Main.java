import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<String>();
        words.add("Lado");
        words.add("Boy");
        words.add("Programming");
        words.add("Java");
        words.add("Hello");
        words.add("World");
        words.add("Python");
        words.add("Swift");
        words.add("JavaScript");
        words.add("C++");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }


        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(5);
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(7);
        numbers2.add(1);
        numbers2.add(0);

        System.out.println(greatestNumberFromList(numbers1, numbers2));
    }
    public static int greatestNumberFromList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int max;
        int x = list1.get(0);
        int y = list2.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if(list1.get(i) > x) {
                x = list1.get(i);
            }
        }
        for (int i = 1; i < list2.size(); i++) {
            if (list2.get(i) > y) {
                y = list2.get(i);
            }
        }
        if (x > y) {
             return x;
        }
        else {
             return y;
        }
    }
}