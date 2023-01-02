//program to find each row sum and column sum
import java.util.Scanner;
public class Problem85 {
    public static void main(String[] args) {
        Scanner sh = new Scanner (System.in);
        System.out.println("Enter the row of the array: ");
        int r = sh.nextInt();
        System.out.println("Enter the column size of the array:");
        int c = sh.nextInt();
        int[][] arr = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j]=sh.nextInt();
            }
        }
        int rowSum=0;
        int columnSum =0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                rowSum += arr[i][j];
            }
            System.out.println("The "+(i+1) +" row sum is "+ rowSum);
            rowSum=0;
        }
        for(int i =0;i<c;i++){
            for(int j =0;j<r;j++){
                columnSum += arr[j][i];
            }
            System.out.println("The "+(i+1) +" column sum is "+columnSum);
            columnSum=0;
        }
        
        sh.close();
    }
}
