import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Common elements: " + getCommonElements(set1, set2));


        Map<Integer, List<Car>> carData = new HashMap<>();
        carData.put(2020, Arrays.asList(
                new Car("Ferrari"),
                new Car("Audi")
        ));
        carData.put(2021, Arrays.asList(
                new Car("Mercedes"),
                new Car("BMW"),
                new Car("Tesla"),
                new Car("Ford")
        ));
        carData.put(2019, Arrays.asList(
                new Car("Nissan"),
                new Car("Mercedes"),
                new Car("Bently")
        ));

        System.out.println("Year in which the most cars were produced:" + getYear(carData));
    }
    public static Set<Integer> getCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElements = new HashSet<>();

        for (Integer num : set1) {
            if (set2.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }
    public static  int getYear(Map<Integer, List<Car>> carData) {
        int maxYear = -1;
        int maxCount = 0;

        for (Integer year : carData.keySet()) {
            int count = carData.get(year).size();
            if (count > maxCount) {
                maxCount = count;
                maxYear = year;
            }
        }
        return maxYear;
    }
}
