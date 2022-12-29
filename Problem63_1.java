public class Problem63_1{
    public static void main(String[] args) {
        int[] arr = {12,2,3,11,33,5,1,10};
        int max = arr[0];
        int min = arr[1];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("The max element in the element is "+max);
        System.out.println("The min element in the array is "+ min);
    }
}