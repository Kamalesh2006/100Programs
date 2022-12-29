public class Problem64_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArray = new int[arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        for(int i : newArray){
            System.out.print(i+" ");
        }
    }
}
