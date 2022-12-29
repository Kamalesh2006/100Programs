//program to find the largest of three numbers
import java.util.Scanner;
public class Problem30 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int a = sh.nextInt();
        int b = sh.nextInt();
        int c = sh.nextInt();
        if (a>b){
            if(a>c){
                System.out.println(a+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        sh.close();
    }
}
