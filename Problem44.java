//print duplicate elements of an array
import java.util.Scanner;
public class Problem44 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sh.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sh.nextInt();
        }
        //printing the duplicate elements of the array
        for(int i =0;i<n;i++){
            boolean flag = false;
            for(int j =i+1;j<n;j++){
                if(arr[i]!=-1){
                    if(arr[i]==arr[j] && !flag){
                        flag = true;
                        System.out.print(arr[j]+ " ");
                        arr[j]=-1;
                    }
                    else if(arr[i]==arr[j] && flag){
                        arr[j]=-1;
                    }
                }
            }
        }
        sh.close();
    }
}  
