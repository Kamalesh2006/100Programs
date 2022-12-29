//program to compute quotient and reminder
import java.util.Scanner;
public class Problem25{
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        //40/3 => 40 is divident and 3 is divisor
        System.out.println("Enter dividend: ");
        int dividend = sh.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = sh.nextInt();
        int quotient = dividend/divisor;
        int reminder = dividend%divisor;
        System.out.println("The quotient is "+ quotient+ " and the reminder is "+reminder);
        sh.close();
    }
}

