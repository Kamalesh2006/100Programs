import java.util.Scanner;
public class Problem49 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        for(int i =n;i>=1;i--){
            for(int k = i;k<n;k++ ){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sh.close();
    }
}
