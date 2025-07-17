import java.util.Scanner;

public class sl_18 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double w = sc.nextDouble();
        double cost = 0;

        if (w <= 0) {
            System.out.println("Invalid weight");
            return;
        }
        if (w > 20) {
            System.out.println("The package is too heavy to ship");
            return;
        }
        if (w <= 2) cost = 2.5;
        else if (w <= 4) cost = 4.5;
        else if (w <= 10) cost = 7.5;
        else cost = 10.5;

        System.out.println("Shipping cost is $" + cost);
    }
}
