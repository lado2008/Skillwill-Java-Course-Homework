public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] array = {"cat", "dog", "car", "toy", "boy", "girl", "bird", "pig", "array", "loop"};

        for (String i : array) {
            System.out.println(i);
        }

        getElementIndex(arr, 11);
    }
    public static void getElementIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Index is: " + i);
                return;
            }
        }
        System.out.println("I couldn't find it");
    }
}