import java.util.Scanner;
import java.io.*;

public class read_numbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new FileReader("nums.txt"))) {
            int sum = 0;

            while (in.hasNextInt()) {
                sum += in.nextInt();
            }
            System.out.println("The sum is: " + sum);
        } catch (IOException e) {
            System.out.println("Error in the file: " + e.toString());
        }
    }
}
