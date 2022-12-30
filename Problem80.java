//program to find the given matrix is sparse matrix
import java.util.Scanner;
public class Problem80 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the row size of the array:");
        int m = sh.nextInt();
        System.out.println("Enter the column size: ");
        int n = sh.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sh.nextInt();
            }
        }
        //checking whether the matrix is sparse or not
        int zeroCount =0;
        int nonZeroCount =0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]==0){
                    zeroCount++;
                }else{
                    nonZeroCount++;
                }
            }
        }
        if(zeroCount>nonZeroCount){
            System.out.println("Given matrix is sparse matrix");
        }else{
            System.out.println("Given matrix is not sparse matrix");
        }
        sh.close();
    }
}
