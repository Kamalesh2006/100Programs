//to print the duplicate elements of the array
import java.util.Arrays;
public class Problem67_1 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,4,5,5,5,6,6,7};
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);
        for(int i =0;i<arr.length;i++){
            if(visited[i])
                continue;
            int count =1;
            visited[i]=true;
            for(int j =i+1;j<arr.length;j++){
                if(!visited[j] && arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count>1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
