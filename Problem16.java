import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        double a = sh.nextDouble();
        double b = sh.nextDouble();
        double c = sh.nextDouble();
        double x1, x2;
        // calculate the determinant (b2 - 4ac)
        double determinant = (b*b) - (4*a*c);
    
        // check if determinant is greater than 0
        if (determinant>0) {
    
          // two real and distinct roots
          x1 = (-b + Math.sqrt(determinant)) / (2 * a);
          x2 = (-b - Math.sqrt(determinant)) / (2 * a);
    
          System.out.format("x1 = %.2f and x2 = %.2f", x1, x2);
        }
    
        // check if determinant is equal to 0
        else if (determinant == 0) {
    
          // determinant is equal to 0, the two roots are real and equal
          // so -b + 0 == -b
          x1 = x2 = -b / (2 * a);
          System.out.format("x1 = x2 = %.2f;", x1);
        }
    
        // if determinant is less than zero
        else {
    
          // roots are complex number
          double real = -b / (2 * a);
          double imaginary = Math.sqrt(-determinant) / (2 * a);
          System.out.format("x1 = %.2f+%.2fi", real, imaginary);
          System.out.format("\nx2 = %.2f-%.2fi", real, imaginary);
        }
        sh.close();
    }
}
