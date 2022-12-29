//print sum of all elements in the array
import java.util.Scanner;
public class Problem45 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sh.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sh.nextInt();
        }

        //sum of all elements
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of all elements in the array is "+sum);
        sh.close();
    }
}
