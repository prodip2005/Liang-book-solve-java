import java.util.Scanner;

public class sl_11 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        int days;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }

        System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
    }
}
