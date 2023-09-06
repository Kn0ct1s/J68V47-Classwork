import java.util.Scanner;
import java.lang.Math;

public class odyssey {
    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        Scanner u_input = new Scanner(System.in);

        int firstN = u_input.nextInt();

        System.out.print("What is the second number? ");
        int secondN = u_input.nextInt();

        System.out.println(firstN + "+" + secondN + "=" + (firstN + secondN));
        System.out.println(firstN + "-" + secondN + "=" + (firstN - secondN));
        System.out.println(firstN + "*" + secondN + "=" + (firstN * secondN));
        System.out.println(firstN + "/" + secondN + "=" + (firstN / secondN));
        System.out.println(firstN + "%" + secondN + "=" + (firstN % secondN));
        // use of Math for the power function
        System.out.println(firstN + "^" + secondN + "=" + Math.pow(firstN, secondN));
    }
}
