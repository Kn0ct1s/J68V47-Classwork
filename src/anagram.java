import java.util.Scanner;
import java.util.Random;

/************************************
 * This program should display five *
 * nine letter anagrams             *
 ************************************/
public class anagram {
    public static void main(String[] args) {
        // array of the words that have been used to make anagrams
        String[] words = {"Technique", "Adulthood", "Baseboards", "Abilities",
                "Textbooks", "Paralyzed", "Lifehacks", "Hijackers", "Acquitted"};

        // array of the anagrams
        String[] anagrams = {"Chen quiet", "ad holdout", "Abba dosers", "Aili bites",
                "BE stook tx", "adz parley", "Ashe flick", "Chris jake", "ac quitted"};

        // for loop that goes through each item in the array and
        // prints it out neatly formatted
        // (Note: Does not print the last one)
        for (int i = 0; i < words.length; i++) {
            System.out.println(anagrams[i] + "\t=\t" + words[i]);
        }

        // make a new scanner object to read user input
        Scanner u_input = new Scanner(System.in);

        // get a random number between the indicis of the array
        Random rand = new Random();
        int random_n = rand.nextInt(words.length);

        System.out.println("Unscrammble this anagram: " + anagrams[random_n]);

        int currTry = 0;

        // give the user 3 trys
        while (currTry < 3){

            System.out.println("Attempt " + currTry);
            System.out.print("--> ");

            // read user input
            String ans = u_input.nextLine();

            // check if they got the word correct
            if (ans.equalsIgnoreCase(words[random_n])) {
                System.out.println("Correct!\nThe word was " + words[random_n]);
                break;
            } else {
                if (currTry == 2) {
                    System.out.println("Wrong, the word was " + words[random_n]);
                } else {
                    System.out.println("Wrong, try again");
                }
                currTry++;
            }
        }
    }
}