import java.util.Scanner;

public class patern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter patern: ");
        String patern = input.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print(patern);
        }
    }
}
