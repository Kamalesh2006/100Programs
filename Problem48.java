import java.util.Scanner;
public class Problem48 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int k =n;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int l = i-1;l>=0;l--){
                System.out.print((k-l)+" ");
            }
            for(int m = 1;m<=i-1;m++){
                System.out.print((k-m)+" ");
            }
            System.out.println();
        }
        sh.close();
    }
}
