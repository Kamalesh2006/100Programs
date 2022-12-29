//print the elements of an array in reverse
public class Problem61_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //copying the elements from the array arr to another array in reverse order
        int[] ans = new int[arr.length];
        int ptr = arr.length-1;
        for(int i =0;i<arr.length;i++){
            ans[i]=arr[ptr];
            ptr--;
        }
        //printing the ans array to the console
        for(int i :ans){
            System.out.print(i+" ");
        }
    }
}
