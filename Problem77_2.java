import java.time.chrono.MinguoDate;

//sorting using selection sort
public class Problem77_2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,3,4,11,21};
        for(int i=0;i<arr.length-1;i++){
            int maxIndex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr [maxIndex]>arr[j]){
                 maxIndex=j;
                }
            }
            if (maxIndex!=i){
                int temp = arr[i];
                arr[i]= arr [maxIndex];
                arr [maxIndex]= temp;
            }
        }
        //printing the array
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
