import java.util.Scanner;

public class sl_14 {
     public static void main(String[] args) {
        int coin = (int)(Math.random() * 2);
        Scanner input = new Scanner(System.in);

        System.out.print("Guess heads or tails (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
