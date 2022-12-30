import java.util.ArrayList;
public class Problem72_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(!al.contains(arr[i])){
                al.add(arr[i]);
            }
        }
        for(int i: al){
            System.out.print(i+" ");
        }
    }
}
