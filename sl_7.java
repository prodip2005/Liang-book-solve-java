import java.util.Scanner;

public class sl_7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;

        if (dollars > 0) {
            System.out.print(dollars + (dollars == 1 ? " dollar" : " dollars"));
        }
        if (quarters > 0) {
            if (dollars > 0) System.out.print(", ");
            System.out.print(quarters + (quarters == 1 ? " quarter" : " quarters"));
        }
        if (dimes > 0) {
            if (dollars > 0 || quarters > 0) System.out.print(", ");
            System.out.print(dimes + (dimes == 1 ? " dime" : " dimes"));
        }
        if (nickels > 0) {
            if (dollars > 0 || quarters > 0 || dimes > 0) System.out.print(", ");
            System.out.print(nickels + (nickels == 1 ? " nickel" : " nickels"));
        }
        if (pennies > 0) {
            if (dollars > 0 || quarters > 0 || dimes > 0 || nickels > 0) System.out.print(", ");
            System.out.print(pennies + (pennies == 1 ? " penny" : " pennies"));
        }
        System.out.println();

       
    }
}
