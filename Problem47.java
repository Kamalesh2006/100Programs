import java.util.Scanner;
public class Problem47 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1+i;j<=n;j++){
                System.out.print("  ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k+ " ");
            }
            for(int l = 2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        sh.close();
    }
}
