import java.util.Scanner;

public class factorial {
    static int facto(int num) {
        if (num == 0) {
            return 1;
        }

        return num * facto(num - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is " + facto(num));
    }
}
