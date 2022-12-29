//find the frequency of elements in an array
import java.util.Scanner;
public class Problem42 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sh.nextInt();
        }
        //finding the frequency of element in array
        for(int i =0;i<n;i++){
            if(arr[i]!=-1){
                int temp = arr[i];
                int count = 1;
                for(int j =i+1;j<n;j++){
                    if(temp == arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
                System.out.println("The element "+ temp+" has "+count+" frequency");
            }
        }
        sh.close();
    }
}
