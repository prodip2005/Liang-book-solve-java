import java.util.Scanner;

public class sl_28 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double left1 = x1 - w1 / 2;
        double right1 = x1 + w1 / 2;
        double top1 = y1 + h1 / 2;
        double bottom1 = y1 - h1 / 2;

        double left2 = x2 - w2 / 2;
        double right2 = x2 + w2 / 2;
        double top2 = y2 + h2 / 2;
        double bottom2 = y2 - h2 / 2;

        boolean inside = (left2 >= left1) && (right2 <= right1) && (top2 <= top1) && (bottom2 >= bottom1);

        boolean overlap = !(right2 < left1 || left2 > right1 || top2 < bottom1 || bottom2 > top1);

        if (inside) {
            System.out.println("The second rectangle is inside the first");
        } else if (overlap) {
            System.out.println("The second rectangle overlaps the first");
        } else {
            System.out.println("The second rectangle does not overlap the first");
        }
    }
}
