import java.util.Scanner;

public class sl_5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input today's day (0 to 6)
        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        // Input number of days after today
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        // Calculate future day index
        int futureDayIndex = (today + daysElapsed) % 7;

        // Get day names
        String[] dayNames = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Output result
        System.out.println("Today is " + dayNames[today] + " and the future day is " + dayNames[futureDayIndex]);
    }
    
}
