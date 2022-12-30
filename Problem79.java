import java.util.Scanner;
public class Problem79 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sh.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sh.nextInt();
            }
        }
        //checking if the matrix is identity matrix
        boolean flag = true;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j && arr[i][j]!=1){
                    flag = false;
                    break;
                }else if(i!=j && arr[i][j]!=0){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                System.out.println("Not an Identity matrix");
                break;
            }
        }
        if(flag){
            System.out.println("Identity matrix");
        }
        sh.close();
    }
}
