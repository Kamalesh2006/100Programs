//program to find ascii value of character
import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter any character to find the ASCII value: ");
        char c = sh.next().charAt(0);
        int ascii = c;
        System.out.println("The ASCII value of "+c + " is "+ascii);
        sh.close();
    }
}
