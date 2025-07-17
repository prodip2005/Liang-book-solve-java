import java.util.Scanner;

public class sl_31 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from U.S. dollars to Chinese RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB, 1 to convert RMB to dollars: ");
        int choice = input.nextInt();

        if (choice == 0) {
            System.out.print("Enter the amount in U.S. dollars: ");
            double dollars = input.nextDouble();
            double rmb = dollars * rate;
            System.out.println(dollars + " dollars is " + rmb + " RMB");
        } else if (choice == 1) {
            System.out.print("Enter the amount in Chinese RMB: ");
            double rmb = input.nextDouble();
            double dollars = rmb / rate;
            System.out.println(rmb + " RMB is " + dollars + " dollars");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
