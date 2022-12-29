//program to find the largest element in the array
public class Problem38 {
    public static void main(String[] args) {
        int[] arr = {3,23,4,5,66,76,32,11};
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is "+max);
    }
}
