import java.util.Scanner;

public class sl_9 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int[] digits = new int[9];
        int temp = num;
        for (int i = 8; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (i + 1);
        }

        int checksum = sum % 11;
        String checkDigit = (checksum == 10) ? "X" : String.valueOf(checksum);

        StringBuilder sb = new StringBuilder();
        for (int d : digits) {
            sb.append(d);
        }
        sb.append(checkDigit);

        System.out.println("The ISBN-10 number is " + sb.toString());
    }
}
