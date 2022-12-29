import java.security.KeyStore.Entry;
import java.util.*;
public class Problem65_1 {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,3,3,4};
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
