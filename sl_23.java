import java.util.Scanner;

public class sl_23 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        double centerX = 1;
        double centerY = 1;
        double width = 10;
        double height = 5;

        if (Math.abs(x - centerX) <= width / 2 && Math.abs(y - centerY) <= height / 2) {
            System.out.println("Point (" + x + ", " + y + ") is inside the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the rectangle");
        }
    }
}
