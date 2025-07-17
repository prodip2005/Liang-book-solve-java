import java.util.Scanner;

public class sl_34 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        boolean onLine = position == 0;
        boolean inRange = x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1) &&
                          y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1);

        if (onLine && inRange) {
            System.out.println("p2 is on the line segment from p0 to p1");
        } else {
            System.out.println("p2 is not on the line segment from p0 to p1");
        }
    }
}
