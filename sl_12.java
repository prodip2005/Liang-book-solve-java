import java.util.Scanner;

public class sl_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Math.abs(input.nextInt());

        int digit1 = num / 100;
        int digit2 = (num / 10) % 10;
        int digit3 = num % 10;

        if (digit1 == digit3) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
