//program to find the factorial of a number and sum of factorial's number
import java.util.Scanner;
public class Problem35 {
    public static int factorial(int n){
        if (n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial of number "+n+" is "+fact);
        int sum =0,temp = fact;
        while(temp>0){
            int rem = temp%10;
            sum += rem;
            temp /= 10;
        }
        System.out.println("The sum of factorial number "+fact+ "'s digits is "+ sum );
        sh.close();
    }
}
