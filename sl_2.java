import java.util.Scanner;

public class sl_2 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10); // 0 to 9
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Prompt the user
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "? ");

        // User input
        int userAnswer = input.nextInt();

        // Calculate the correct answer
        int correctAnswer = number1 * number2 * number3;

        // Check the answer
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The correct answer is " + correctAnswer);
        }

    }
}
