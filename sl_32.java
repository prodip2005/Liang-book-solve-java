import java.util.Scanner;

public class sl_32 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (position > 0) {
            System.out.println("p2 is on the left side of the line");
        } else if (position == 0) {
            System.out.println("p2 is on the same line");
        } else {
            System.out.println("p2 is on the right side of the line");
        }
    }
}
