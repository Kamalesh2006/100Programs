import java.util.Scanner;
public class Problem32 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        if(n<0){
            System.out.println("The number "+n+ " is negative");
        }else{
            System.out.println("The number "+n+" is positive");
        }
        sh.close();
    }
}
