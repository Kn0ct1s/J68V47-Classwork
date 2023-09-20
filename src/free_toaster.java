import java.util.Scanner;


public class free_toaster {

    public static class Order {
        public String f_name;
        public String l_name;

        private double price;
        private double deposit;

        Scanner input = new Scanner(System.in);

        public Order() {
            this.f_name = " ";
            this.l_name = " ";
            this.price = 0.0;
            this.deposit = 0.0;
        }

         void get_name() {
            System.out.print("Enter your first name: ");
            this.f_name = input.nextLine();

            System.out.print("Enter your last name: ");
            this.l_name = input.nextLine();
        }

        void get_price_dep() {
            System.out.print("Enter the total value of your order: £");
            this.price = input.nextFloat();

            System.out.print("Enter the amount you wish to pay as deposit: £");
            this.deposit = input.nextDouble();
        }

        void recipt() {
            System.out.println("== RECEPIT ==");

            System.out.println("Customer: " + this.f_name.charAt(0) + " " + this.l_name);
            System.out.println("Order Total: £" + round(this.price));
            System.out.println("Deposit paid: £" + round(this.deposit));
            System.out.println("Reminder: £" + round(this.price - this.deposit));

            if ((this.price - this.deposit) > 150) {
                System.out.println("You get a free toaster!");
            }
            System.out.println("Have a nice day!");
        }
    }

    static double round(double num) {
        double roundOff = Math.round(num * 100.0) / 100.0;
        return roundOff;
    }
    public static void main(String[] args) {

        Order order = new Order();

        order.get_name();
        order.get_price_dep();
        order.recipt();

    }
}
