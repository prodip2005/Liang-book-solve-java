import java.util.Random;

public class sl_4 {
     public static void main(String[] args) {
        Random rand = new Random();

        // Generate random number between 1 and 12
        int monthNumber = rand.nextInt(12) + 1;  // rand.nextInt(12) gives 0 to 11, so we add 1

        String monthName = "";

        switch (monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        System.out.println("Random number: " + monthNumber);
        System.out.println("Month: " + monthName);
    }
}