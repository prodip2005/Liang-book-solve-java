import java.util.Scanner;

public class sl_10 {
     public static void main(String[] args) {
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + "? ");
        int answer = input.nextInt();

        if (answer == number1 * number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The correct answer is " + (number1 * number2));
        }
    }
}
