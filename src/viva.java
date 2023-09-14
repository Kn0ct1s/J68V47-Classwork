import java.util.Scanner;


public class viva {
    public static class Question {
        String question;
        String answer;

        boolean check_answer(String u_answer) {
            return u_answer.equalsIgnoreCase(answer);
        }
    }
    public static void main(String[] args) {
        Question[] questions = new Question[3];

        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();
        }

        questions[0].question = "What is the currency of Denmark?";
        questions[0].answer = "Krone";

        questions[1].question = "What is the smallest planet in our Solar System?";
        questions[1].answer = "Mercury";

        questions[2].question = "What is the capital of New Zealand?";
        questions[2].answer = "Wellington";

        Scanner u_input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print(questions[i].question + " ");
            String answer = u_input.nextLine();
            System.out.println(questions[i].check_answer(answer));
        }
    }
}
