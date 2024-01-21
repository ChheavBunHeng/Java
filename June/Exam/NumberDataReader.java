import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberDataReader {
    public static void main(String[] args) {
        String fileName = "./mydata.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file: " + e.getMessage());
        }
    }
}