/****************************************
 * This program should print a haiku    *
 * about a current event                *
 ****************************************/

public class haiku {
    public static void main(String[] args) {
        // array with each line of the haiku
        String[] lines = {"Heat waves scorches land",
                    "Crops wilt under blazing sun",
                    "Climate change marches on",};

        // use of a for each loop here to reduce the numbers of variables
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
