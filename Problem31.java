import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        double a = sh.nextDouble();
        double b = sh.nextDouble();
        double c = sh.nextDouble();
        double root1, root2;
        // calculate the dtr (b2 - 4ac)
        double dtr = (b*b) - (4*a*c);
    
        // check if determinant is greater than 0
        if (dtr>0) {
    
          // two real and distinct roots
          root1 = (-b + Math.sqrt(dtr)) / (2 * a);
          root2 = (-b - Math.sqrt(dtr)) / (2 * a);
    
          System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
    
        // check if dtr is equal to 0
        else if (dtr == 0) {
    
          // dtr is equal to 0, the two roots are real and equal
          // so -b + 0 == -b
          root1 = root2 = -b / (2 * a);
          System.out.format("root1 = root2 = %.2f", root1);
        }
    
        // if dtr is less than zero
        else {
    
          // roots are complex number
          double real = -b / (2 * a);
          double imaginary = Math.sqrt(-dtr) / (2 * a);
          System.out.format("root1 = %.2f+%.2fi", real, imaginary);
          System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
        sh.close();
    }
}
