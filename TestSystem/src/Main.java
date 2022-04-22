import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String[] questions = {
                "Scolco stoit mir?",
                "dsdsdsdsd",
                "dsdsdsdsd"};

        final String[][] answers = {
                {"Trololo", "POPO", "DON", "VON"},
                {"Ololo", "MONOMON", "fdfdf", "som"},
                {"ewewew", "ewewew", "ewewew", "ewewewe"}
        };

        final int[] rightAnswers = {1, 2, 2};
        //TODO test

        if (questions.length != answers.length ||
                questions.length != rightAnswers.length) {
            System.out.println("Error: Arrays have different lengths!");
            System.exit(0);
        }

        final int MAX_VALUE = answers[0].length;
        final int MIN_VALUE = 1;
        int totalCorrectAnswers = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.printf("%d.%s\n", j + MIN_VALUE, answers[i][j]);
            }

            int userInput = 0;
            while (true) {
                if (scanner.hasNextInt()) {
                    userInput = scanner.nextInt();
                }
                if (userInput >= MIN_VALUE && userInput <= MAX_VALUE) {
                    if(userInput == rightAnswers[i]) {
                        totalCorrectAnswers++;
                    }
                    break;
                }
                System.out.printf("The value must be a number " +
                        "in the range from %d to %d! Try again!)\n", MIN_VALUE, MAX_VALUE);
                scanner.next();
            }
        }
        System.out.printf("Result: right %d, not right %d",
                totalCorrectAnswers, (MAX_VALUE - MIN_VALUE) - totalCorrectAnswers);
    }
}