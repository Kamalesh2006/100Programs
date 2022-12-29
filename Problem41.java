//copy all the elements of the array into another array
public class Problem41 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr1.length];
        for(int i =0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        //Printing all the elements of the copied array
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }
}
