import java.io.*;

public class readtime_tables {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader( new FileReader("output.txt"))) {
            String line = in.readLine();
            do {
                System.out.println(line);
                line = in.readLine();
            } while (line != null);
        } catch(IOException e) {
            System.out.println("Error in the file: " + e.toString());
        }
    }
}
