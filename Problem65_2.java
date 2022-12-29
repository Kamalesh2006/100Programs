import java.util.Arrays;
public class Problem65_2 {
    public static void main(String[] args) {
        int[] arr = {12,11,11,13,12,15,15};
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);
        for(int i =0;i<arr.length;i++){
            int count =1;
            if(!visited[i]){
                visited[i]=true;
                for(int j =i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                System.out.println(arr[i]+" "+count);
            }
        }
    }
}
