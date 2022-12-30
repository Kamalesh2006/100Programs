//to rotate the array in the right direction
import java.util.Scanner;
public class Problem69_1 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int[] arr ={1,2,3,4,5,6,7,8,9};
        while(n>0){
            int end = arr[arr.length-1];
            for(int i =arr.length-1;i>0;i--){
                arr[i]= arr[i-1];
            }
            arr[0]=end;
            n--;
        }
        //printing the array 
        for(int i: arr){
            System.out.print(i+" ");
        }
        sh.close();
    }
}
