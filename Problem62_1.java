public class Problem62_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //printing the elements in odd positions\

        System.out.println("Elements in odd positions: ");
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\nElements in even positions: ");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0)
                System.out.print(arr[i]+" ");
        }
    }
}
