import java.util.concurrent.SynchronousQueue;

public class Problem39 {
    public static void main(String[] args) {
        int[] arr = {13,22,43,5,65,109,777};
        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The smallest element present in the array is "+min);
    }
}
