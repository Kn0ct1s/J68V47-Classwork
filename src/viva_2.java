import java.util.Scanner;

public class viva_2 {
    public static class Question {
        String question;
        String answer;

        void check_answer(String u_answer) {
            boolean answer_true = u_answer.equalsIgnoreCase(answer);

            if (answer_true) {
                System.out.println("True");
            } else {
                System.out.println("False, the asnwer is " + answer);
            }
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
            questions[i].check_answer(answer);
        }

    }
}
