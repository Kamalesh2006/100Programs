//program to display the odd and even number frequency in the matrix
import java.util.Scanner;
public class Problem84 {
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

        int oddCount =0;
        int evenCount =0;
        //counting the frequency of odd and even number in the matrix
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(arr[i][j]%2!=0){
                    oddCount++;
                }
                else if(arr[i][j]%2==0){
                    evenCount++;
                }
            }
        }
        System.out.println("The frequency of even numbers in the matrix is "+evenCount);
        System.out.println("The frequency of odd number in the matrix is "+oddCount);
        sh.close();
    }
}
