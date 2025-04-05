
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        fileManipulation("My name is Lado Adamia");
    }

    private static void fileManipulation(String text) {
        File myObj = new File("C:\\Lado Projects\\Java_Projects\\Test_Project\\src\\Text.txt");

        //Create File
        try {
            if(myObj.createNewFile()) {
                System.out.println("File Successfully created!");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Something Happened! :)");
        }
        //Write text in the file
        try {
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Text Successfully added to file");
        } catch (IOException e) {
            System.out.println("Something happened");
            e.printStackTrace();
        }
        //Read text form file
        try {
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            System.out.println("Text Successfully read from file");
        } catch (FileNotFoundException e) {
            System.out.println("Something happened");
        }
    }
}
