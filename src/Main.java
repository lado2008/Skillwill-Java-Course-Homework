
public class Main {
    public static void main(String[] args) {
        System.out.println("This is average of four numbers: " + fourNumbersAverage(2, 3, 5, 1));
        System.out.println("This is sum of strings length: " + stringLengthSum("Lado", "Adamia", "Hallo"));
    }

    static double fourNumbersAverage(int number1, int number2, int number3, int number4) {
        return (number1 + number2 + number3 + number4) / 4.0;
    }
    static int stringLengthSum(String text1, String text2, String text3) {
        return text1.length() + text2.length() + text3.length();
    }
}