import java.util.Scanner;

public class sl_27 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Triangle vertices: A(0,0), B(200,0), C(0,100)
        // Using barycentric coordinates or area method to check if point is inside

        // Calculate area of the triangle ABC
        double areaABC = 0.5 * 200 * 100;

        // Calculate area of sub-triangles PBC, APC, and ABP
        double areaPBC = 0.5 * Math.abs(x*(0 - 100) + 200*(100 - y) + 0*(y - 0));
        double areaAPC = 0.5 * Math.abs(0*(y - 0) + x*(0 - 0) + 0*(0 - y));
        double areaABP = 0.5 * Math.abs(0*(0 - y) + 200*(y - 0) + x*(0 - 0));

        double sumAreas = areaPBC + areaAPC + areaABP;

        // Allow a small margin for floating point errors
        if (Math.abs(sumAreas - areaABC) < 1e-10) {
            System.out.println("Point (" + x + ", " + y + ") is inside the triangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the triangle");
        }
    }

}