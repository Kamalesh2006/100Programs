import java.util.*;
public class Problem72_1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int[] arr = {1,2,2,3,3,3,4,4,5,6,7};
        for(int i =0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }else{
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            System.out.print(entry.getKey()+" ");
        }
    }
}
