import java.util.Scanner;

public class day_of_the_week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            case 7:
                System.out.println("Sunday");
                return;
            default:
                System.out.println("Out of range");
        }
    }
}
