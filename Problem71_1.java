public class Problem71_1 {
    public static void main(String[] args) {
        int[] arr ={1,11,2,12,14,55,23,25};
        int min = arr[0];
        int secMin=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                secMin = min;
                min = arr[i];
            }
            else if(arr[i]<secMin && arr[i]>min){
                secMin = arr[i];
            }
        }
        System.out.println("The second largest element in the array is "+secMin);
    }
}
