import java.io.*;

public class timetable_tofile {
    public static void main(String[] args) {
        try(PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            for (int i = 1; i <= 12; i++) {
                for (int x = 1; x <= 10; x++) {
                    out.println(i + " x " + x + " = " + (i * x));
                }
            }
        } catch(IOException e) {
            System.out.println("Error occured writing to file: " + e.toString());
        }
    }
}
