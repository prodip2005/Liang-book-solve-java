import java.util.Scanner;

public class sl_29 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        if (distance + r2 <= r1) {
            System.out.println("Circle 2 is inside Circle 1");
        } else if (distance <= r1 + r2) {
            System.out.println("Circle 2 overlaps Circle 1");
        } else {
            System.out.println("Circle 2 does not overlap Circle 1");
        }
    }
    
}
