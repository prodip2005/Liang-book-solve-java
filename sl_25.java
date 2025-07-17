import java.util.Scanner;

public class sl_25 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = a1 * x1 + b1 * y1;

        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = a2 * x3 + b2 * y3;

        double det = a1 * b2 - a2 * b1;

        if (det == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
}
}
