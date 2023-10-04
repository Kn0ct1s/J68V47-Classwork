import java.util.Scanner;

public class times_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a base number: ");
        int num = input.nextInt();

        for (int i = 0; i < 13; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
