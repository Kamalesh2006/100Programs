import java.util.*;
public class Problem67_2 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,4,5,6,6,7,7,7,8};
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }else{
                m.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
