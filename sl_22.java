import java.util.Scanner;

public class sl_22 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= 10) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle");
        }
    }
}
