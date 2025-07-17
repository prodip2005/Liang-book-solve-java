import java.util.Scanner;

public class sl_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            System.out.println("Perimeter is " + perimeter);
        } else {
            System.out.println("Input is invalid");
        }
    }

}
