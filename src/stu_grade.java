import java.util.Scanner;

public class stu_grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student score: ");
        double score = input.nextDouble();

        char grade;

        if (score >= 70.0) {
            grade = 'A';
        } else if (score >= 60.0) {
            grade = 'B';
        } else if (score >= 50.0) {
            grade = 'C';
        } else if (score >= 40.0) {
            grade = 'D';
        } else {
            grade = '!';
        }
        if (grade == '!') {
            System.out.println("No award");
        } else {
            System.out.println("Students grade: " + grade);
        }
    }
}
