import java.util.ArrayList;
public class Problem75_1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        System.out.println("Even elements in array are: ");
        for(int i : even){
            System.out.print(i+" ");
        }
        System.out.println("\nOdd elements in array are: ");
        for(int i : odd){
            System.out.print(i+" ");
        }
    }
}
