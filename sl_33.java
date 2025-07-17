import java.util.Scanner;

public class sl_33 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double costPerUnit1 = price1 / weight1;
        double costPerUnit2 = price2 / weight2;

        if (costPerUnit1 < costPerUnit2) {
            System.out.println("Package 1 has the better price.");
        } else if (costPerUnit2 < costPerUnit1) {
            System.out.println("Package 2 has the better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }
    }
}
