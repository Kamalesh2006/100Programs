//two matrices are equal
import java.util.Scanner;
public class Problem81 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the row of the first array:");
        int r1 = sh.nextInt();
        System.out.println("\nEnter the column size of the first array: ");
        int c1 = sh.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("\nEnter the elements of the array:");
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]= sh.nextInt();
            }
        }
        System.out.println("Enter the row of the second array:");
        int r2 = sh.nextInt();
        System.out.println("\nEnter the column size of the second array: ");
        int c2 = sh.nextInt();
        int[][] arr2 = new int[r1][c1];
        System.out.println("\nEnter the elements of the array:");
        for(int i =0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]= sh.nextInt();
            }
        }
        //checking the two arrays are equal
        boolean flag = false;
        if(r1==r2 && c1==c2){
            for(int i =0;i<r1;i++){
                for(int j =0;j<c1;j++){
                    if(arr1[i][j]!=arr2[i][j]){
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
        }
        else if(r1!=r2 || c1!=c2){
            flag = true;
        }
        if(flag)
            System.out.println("\nTwo matrices are not equal");
        else{
            System.out.println("Two matrices are equal");
        }
        sh.close();
    }
}
