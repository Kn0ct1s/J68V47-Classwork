import java.util.concurrent.TimeUnit;

/****************************************
 * This program should print a haiku    *
 * about a current event                *
 ****************************************/

public class haiku {
    public static void main(String[] args) {

        System.out.println("Here is a Haiku:\n");

        // array with each line of the haiku
        String[] lines = {"Heat waves scorches land",
                    "Crops wilt under blazing sun",
                    "Climate change marches on",};

        // use of a for each loop here to reduce the numbers of variables
        for (String line : lines) {
            try{
                System.out.println(line);
                TimeUnit.SECONDS.sleep(1);
            } catch(java.lang.InterruptedException e) {
                System.err.println("Error: " + e + ".\nQuitting.");
                System.exit(1);
            }
        }
    }
}
