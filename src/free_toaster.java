import java.util.Scanner;

public class free_toaster {

    static double round(double num) {
        double roundOff = Math.round(num * 100.0) / 100.0;
        return roundOff;
    }
    public static void main(String[] args) {
        Scanner u_input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String f_name = u_input.nextLine();

        System.out.print("Enter your last name: ");
        String l_name = u_input.nextLine();

        System.out.print("Enter the total value of your order: £");
        double price = u_input.nextFloat();

        System.out.print("Enter the amount you wish to pay as deposit: £");
        double deposit = u_input.nextDouble();

        System.out.println("== RECEIPT ==");
        System.out.println("Customer: " + f_name.charAt(0) + " " + l_name);

        System.out.println("Order Total: £" + round(price));
        System.out.println("Deposit paid: £" + round(deposit));
        System.out.println("Reminder: £" + round(price - deposit));

        if ((price - deposit) > 150) {
            System.out.println("You get a free toaster!");
        }

        System.out.print("Have a nice day!");
    }
}
