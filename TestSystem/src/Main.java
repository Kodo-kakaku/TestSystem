import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String[] questions = {
                "C++ is an object oriented language, and C, BASIC, and Pascal are _____ languages",
                "In C++, a pointer is",
                "\"Google Language Translator\" is an example of the application of"
        };

        final String[][] answers = {
                {"procedural", "scripting", "general purpose", "web based"},
                {"address of a variable", "variable for storing addresses",
                        "data type of an address variable", "constant value"},
                {"internet", "debugging", "computer simulations", "machine learning"}
        };

        // top secret answers to questions
        final int[] rightAnswers = {1, 2, 4};

        final int MAX_VALUE = answers[0].length;
        final int MIN_VALUE = 1;
        int totalCorrectAnswers = 0;

        System.out.println("Hi! Take an excellent computer science test:");
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
                    if (userInput == rightAnswers[i]) {
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
                totalCorrectAnswers, questions.length - totalCorrectAnswers);
    }
}