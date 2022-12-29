//java program to rotate the array in right direction
import java.util.Scanner;
public class Problem46 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number of times to right rotate the array elements: ");
        int n = sh.nextInt();
        while(n>0){
            int start = arr[0];
            for(int i =1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=start;
            n--;
        }
        //printing the right rotated array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sh.close();
    }
}
