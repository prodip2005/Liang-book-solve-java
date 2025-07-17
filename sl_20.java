import java.util.Scanner;

public class sl_20 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        if (temperature < -58 || temperature > 41) {
            System.out.println("Temperature is invalid");
        } else if (windSpeed < 2) {
            System.out.println("Wind speed is invalid");
        } else {
            double windChill = 35.74 + 0.6215 * temperature
                               - 35.75 * Math.pow(windSpeed, 0.16)
                               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.println("Wind chill index is " + windChill);
        }
    }

}
