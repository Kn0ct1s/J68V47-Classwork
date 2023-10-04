import java.util.Scanner;

public class maths_game {

    public static class Question {
        String question;
        int answer;

        boolean check_answer(int u_answer) {
            return (u_answer == answer);
        }
    }

    public static void main(String[] args) {
        Question[] questions = new Question[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            questions[i] = new Question();
        }

        questions[0].question = "10 + 2";
        questions[0].answer = 12;

        questions[1].question = "2 x 10";
        questions[1].answer = 20;

        questions[2].question = "10 / 2";
        questions[2].answer = 5;

        questions[3].question = "10 - 1";
        questions[3].answer = 9;

        questions[4].question = "2 * 20";
        questions[4].answer = 40;

        questions[5].question = "90 - 54";
        questions[5].answer = 36;

        questions[6].question = "36 + 10";
        questions[6].answer = 46;

        questions[7].question = "50 - 2";
        questions[7].answer = 48;

        questions[8].question = "2 x 1";
        questions[8].answer = 2;

        questions[9].question = "2 + 4";
        questions[9].answer = 6;

        int corr_answers = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println(questions[i].question);
            System.out.print("--> ");
            int answer = input.nextInt();

            boolean correct = questions[i].check_answer(answer);

            if (correct) {
                System.out.println("Correct\n");
                corr_answers++;
            } else {
                System.out.println("Wrong, the answer is " + questions[i].answer + "\n");
            }
        }

        System.out.println("Number of correct answers: " + corr_answers);
    }
}
