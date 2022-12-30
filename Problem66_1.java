//left rotate the elements of an array
import java.util.Scanner;
public class Problem66_1 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the number of times to left rotate the array: ");
        int n = sh.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
        while(n>0){
            int temp = arr[0];
            for(int i =1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
            n--;
        }
        //printing the left rotated array
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sh.close();
    }
}
