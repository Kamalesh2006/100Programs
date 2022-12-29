import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter size of the 2d array: ");
        int n = sh.nextInt();
        System.out.println("Enter the values of array");
        int[][] arr = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sh.nextInt();
            }
        }
        //left rotation
        int start =0;
        int end = n-1;
        while(end>=start){
            for(int i =0;i<n;i++){
                System.out.print(arr[i][end] +" ");
            }
            System.out.println();
            end--;
        }
        sh.close();
    }
}
