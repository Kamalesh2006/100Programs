//print the equivalent capital letter
import java.util.Scanner;
public class Problem98 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter lower case alphabet to find the equivalent capital letter: ");
        char c = sh.next().charAt(0);
        char newC = (char)(c-32);
        System.out.println("The equivalent capital letter for "+c+ " is "+newC);
        sh.close();
    }
}
