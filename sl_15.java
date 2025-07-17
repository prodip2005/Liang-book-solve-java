import java.util.Scanner;

public class sl_15 {
     public static void main(String[] args) {
        int lottery = (int)(Math.random() * 900) + 100;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int l1 = lottery / 100;
        int l2 = (lottery / 10) % 10;
        int l3 = lottery % 10;

        int g1 = guess / 100;
        int g2 = (guess / 10) % 10;
        int g3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $12,000");
            return;
        }

        boolean[] matchedLottery = new boolean[3];
        boolean[] matchedGuess = new boolean[3];

        int matchCount = 0;
        int[] lotteryDigits = {l1, l2, l3};
        int[] guessDigits = {g1, g2, g3};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!matchedLottery[j] && !matchedGuess[i] && guessDigits[i] == lotteryDigits[j]) {
                    matchedLottery[j] = true;
                    matchedGuess[i] = true;
                    matchCount++;
                    break;
                }
            }
        }

        if (matchCount == 3) {
            System.out.println("Match all digits: you win $5,000");
        } else if (matchCount >= 1) {
            System.out.println("Match one digit: you win $2,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
