import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class simple_menu {

    public static void say_hello() {
        System.out.println("Hello!");
    }

    public static void tell_time() {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        String formatted = current.format(format);

        System.out.println("The time is: " + formatted);
    }

    public static void tell_joke() {
        System.out.println("My wife asked how airplane food is.");
        System.out.println("I said \"Well its plane\"");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String input_got;
        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("Enter a command:\n1: Say \"hello\"");
            System.out.println("2: Tell me the time\n3: Tell me a joke\n4: quit\n");
            switch (input_got = input.nextLine()) {
                case "1" -> say_hello();
                case "2" -> tell_time();
                case "3" -> tell_joke();
                case "4" -> System.exit(0);
                default -> {
                    System.out.println("Invalid command\nTry again\n");
                }
            }
        }
    }
}
