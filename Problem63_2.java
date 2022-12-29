public class Problem63_2 {
    public static void main(String[] args) {
        int[] arr = {11,2,12,14,55,8,19,66};
        //sort the array so that the first element is min and last element is max
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j+1]>arr[j]){
                    flag = true;
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            if(!flag)
                break;
        }
        System.out.println("The min element is "+arr[0]);
        System.out.println("The max element is "+arr[arr.length-1]);
    }
}
