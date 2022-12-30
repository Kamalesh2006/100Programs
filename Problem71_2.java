public class Problem71_2{
    public static void main(String[] args) {
        int[] arr ={11,34,22,43,54,20};
        //sort the array and second position element is the second minimum element
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if(!flag ){
                break;
            }
        }
        System.out.println("The second smallest element in the array is "+arr[1]);
    }
}