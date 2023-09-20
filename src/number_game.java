import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class number_game {
    public static void main(String[] args) {
        int max = 100;
        int min = 0;

        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("RANDOM NUMBER GAME\n5 TRYS");

        int try_num = 0;
        Scanner input = new Scanner(System.in);

        while (try_num < 5) {
            // add 1 as it is 1 behind
            System.out.println("\nTry " + (try_num + 1));
            System.out.print("Enter guess --> ");
            int guess = input.nextInt();

            if (guess == randomNum) {
                System.out.println("YOU WON!");
                System.exit(0);
            } else if (guess < randomNum) {
                System.out.println("Cold");
                try_num++;
            } else {
                System.out.println("Hot");
                try_num++;
            }
        }

        System.out.println("You lost");
    }
}
