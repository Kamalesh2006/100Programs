import java.util.Scanner;
public class Problem58 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int row = n*2-1;
        for(int i =1;i<=row;i++){
            if(i<=n){
                for(int j =n-i+1;j>=1;j--){
                    System.out.print("*");
                }
                for(int k=1;k<=i-1;k++){
                    System.out.print("_");
                }
                for(int k =1;k<=i-1;k++){
                    System.out.print("_");
                }
                for(int j =n-i+1;j>=1;j--){
                    System.out.print("*");
                }
            }
            else{
                for(int j =1;j<=i-n+1;j++){
                    System.out.print("*");
                }
                for(int k =i-n;k<n-1;k++){
                    System.out.print("_");
                }
                for(int k =i-n;k<n-1;k++){
                    System.out.print("_");
                }
                for(int j =1;j<=i-n+1;j++){
                    System.out.print("*");
                }

            }
            
            System.out.println();
        }
        sh.close();
    }
}
