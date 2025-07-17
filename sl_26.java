import java.util.Scanner;

public class sl_26 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean divBy4 = (num % 4 == 0);
        boolean divBy5 = (num % 5 == 0);

        System.out.println(num + " is divisible by 4 and 5: " + (divBy4 && divBy5));
        System.out.println(num + " is divisible by 4 or 5: " + (divBy4 || divBy5));
        System.out.println(num + " is divisible by 4 or 5 but not both: " + (divBy4 ^ divBy5));
    }
}
