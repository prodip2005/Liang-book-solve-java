import java.util.Random;

public class sl_16 {
     public static void main(String[] args) {
        Random rand = new Random();
        double centerX = 0, centerY = 0;
        double width = 50, height = 150;

        double x = centerX - width / 2 + rand.nextDouble() * width;
        double y = centerY - height / 2 + rand.nextDouble() * height;

        System.out.println("Random point: (" + x + ", " + y + ")");
    }
}
