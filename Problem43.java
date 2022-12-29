//left rotate an array
import java.util.Scanner;
public class Problem43 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Enter n value to left rotate n times");
        int n = sh.nextInt();
        while(n>0){
            int last = arr[arr.length-1];
            int end = arr.length-1;
            int start =0;
            while(end>start){
                int temp = arr[end-1];
                arr[end]= temp;
                end--;
            }
            arr[start]=last;
            n--;
        }
        //after n rotation
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sh.close();
    }
}
