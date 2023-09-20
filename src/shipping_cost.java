import java.util.Scanner;

public class shipping_cost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: £");
        double price = input.nextDouble();

        double shipping;

        if (price < 50.0) {
            shipping = 10.0;
        } else {
            shipping = 0.0;
        }

        System.out.println("Shipping cost is = £" + shipping);

        System.out.println("Your final total is = " + (price + shipping));
    }
}
