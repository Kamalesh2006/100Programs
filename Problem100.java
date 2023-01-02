//program to convert ascii value to character without using any special functions
import java.util.Scanner;
public class Problem100 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println("Enter a value between 65 to 90");
        int value = sh.nextInt();
        int index = value -65;
        System.out.println("The character of ASCII value "+value+" is "+c[index]);
        sh.close();
    }
}
