public class Problem70_1 {
    public static void main(String[] args) {
        int[] arr = {11,2,33,24,26,21};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for( int i =0;i<arr.length;i++){
            if(arr[i]>max ){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i]>secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
        System.out.println("The second max element in the array is "+secondMax);
    }
}
