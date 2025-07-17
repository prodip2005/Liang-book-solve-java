import java.util.Scanner;

public class sl_8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }

        System.out.println(a + " " + b + " " + c);
        
    }
}
