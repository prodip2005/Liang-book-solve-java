import java.util.Scanner;

public class sl_21 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println(days[h]);
    }
}
