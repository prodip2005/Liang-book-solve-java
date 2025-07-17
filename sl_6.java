import java.util.Scanner;

public class sl_6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        int totalInches = feet * 12 + inches;
        double heightMeters = totalInches * 0.0254;
        double weightKg = weight * 0.45359237;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is " + bmi);

        input.close();
    }
}
