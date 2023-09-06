import java.util.Scanner;
public class short_story {
    public static void main(String[] args) {
        Scanner u_input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = u_input.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = u_input.nextLine();

        // make a array of strings with 3 slots
        String[] lines = new String[3];

        lines[0] = String.format("%s loves %s in their free time.", name, hobby);
        lines[1] = String.format("They find it relaxing and satisfying to see their %s come to life.",hobby);
        lines[2] = String.format("%s allows %s to express their creative side.", name, hobby);

        // use of 'for each' loop to reduce exces variables
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
