import java.util.Arrays;

public class Problem64_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copy = Arrays.copyOf(arr, arr.length);
        for(int i : copy){
            System.out.print(i+" ");
        }
    }
}
