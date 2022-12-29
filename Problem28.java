//program to check whether a number is even or odd
import java.util.Scanner;
public class Problem28 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+ " is odd");
        }
        sh.close();
    }
}
