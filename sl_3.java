import java.util.Scanner;

public class sl_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f: ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double d=in.nextDouble();
        double e=in.nextDouble();
        double f=in.nextDouble();
        double first=(a*d)-(b*c);
        if (first==0) {
            System.out.println("The equation has no soution");
        }
        else{
            double second=((e*d)-(b*f))/((a*d)-(b*c));
            double third=((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x is "+second+" y is "+third);
        }
    }
}
