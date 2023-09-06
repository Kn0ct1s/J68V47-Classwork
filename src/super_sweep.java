import java.util.Scanner;
public class super_sweep {
    public static void main(String[] args) {
        String[] names = new String[3];
        int[] prices = new int[3];

        for (int x = 1; x <= 3; x++) {
            // make a new scanner each time as other wise you get an weird bug where it takes the
            // '\n' as input
            Scanner u_input = new Scanner(System.in);
            System.out.print("Enter the name of item " + x + ": ");
            String name = u_input.nextLine();

            System.out.print("Enter the price of item " + x + ": ");
            int price = u_input.nextInt();

            // take one away as arrays start at 0 and x starts at 1
            names[x - 1] = name;
            prices[x - 1] = price;
        }

        System.out.println("NESMART");
        for (int x = 0; x < 3; x++) {
            System.out.println(names[x] + "......." + prices[x]);
        }
    }
}
