public class Problem70_2 {
    public static void main(String[] args){
        int[] arr ={11,2,33,14,15,36,24};
        //sort the array and the second element from the last is the second largest element
        //bubble sort
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                }
            }
            if(!flag){
                break;
            }
        }
        //printing the second max
        System.out.println("The second maximum element in the array is "+arr[arr.length-2]);
    }
}
