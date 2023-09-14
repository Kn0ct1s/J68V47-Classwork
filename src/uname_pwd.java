import java.util.Locale;
import java.util.Scanner;

public class uname_pwd {
    public static void main(String[] args) {
        Scanner u_input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String f_name = u_input.nextLine();

        System.out.print("Enter your surname: ");
        String l_name = u_input.nextLine();

        System.out.print("Enter your year of birth YYYY: ");
        int b_day = u_input.nextInt();

        String u_name = f_name.toUpperCase(Locale.ROOT).charAt(0) + l_name;
        String pwd = l_name.toLowerCase().charAt(0) + f_name.toUpperCase(Locale.ROOT) + b_day;

        System.out.println("Username: " + u_name);
        System.out.println("Password: " + pwd);
    }
}