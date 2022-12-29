import java.util.Scanner;
public class Problem15 {
    public static double areaOfCylinder(int r, int h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        int radius = sh.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        int height = sh.nextInt();
        System.out.println("Area of the cylinder is "+ areaOfCylinder(radius, height));
        sh.close();
    }
}
