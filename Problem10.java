import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args){
        int[] arr = {5,1,2,3,4,6,7};
        //sorting the array using bubble sorting
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag =true;
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }
        }
        
        int maxPtr = arr.length-1;
        int minPtr= 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(minPtr<maxPtr){
            al.add(arr[maxPtr]);
            al.add(arr[minPtr]);
            maxPtr--;
            minPtr++;
            if(minPtr==maxPtr){
                al.add(arr[maxPtr]);
            }
        }
        System.out.println(al);
    }
}
