//program to display the lower triangular matrix
import java.util.Scanner;
public class Problem82 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sh.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sh.nextInt();
            }
        }

        //displaying lower triangular matrix
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(j>i){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        sh.close();
    }
}
