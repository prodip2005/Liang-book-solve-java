import java.util.Scanner;

public class sl_1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter a, b, c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();

        double ans1,ans2;
        double D=b*b-4*a*c;
        if (D<0) {
            System.out.println("error");
        }
        else{
            ans1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            ans2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("The equation has two roots "+ans1+" and "+ans2);
        }
    }
}