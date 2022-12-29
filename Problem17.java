//find the area of the e space between the circles
import java.util.Scanner;
public class Problem17 {
    public static double areaOfCircle(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the radius of the larger circle");
        int r1 = sh.nextInt();
        System.out.println("Enter the radius of the smaller concetric circle ");
        int r2 = sh.nextInt();
        double area1 = areaOfCircle(r1);
        double area2 = areaOfCircle(r2);
        double result = area1-area2;
        System.out.println("Area between two concetric circle of radius "+r1 +" and "+r2+" is "+result);
        sh.close();
    }
}
