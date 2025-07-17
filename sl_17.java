import java.util.Scanner;

public class sl_17 {
     public static void main(String[] args) {
        int computer = (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        String[] names = {"scissor", "rock", "paper"};
        System.out.println("The computer is " + names[computer] + ". You are " + names[user] + ".");

        if (user == computer) {
            System.out.println("It is a draw");
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
    
}
