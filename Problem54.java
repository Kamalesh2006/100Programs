import java.util.Scanner;
public class Problem54 {
    public static void sortArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            if(!flag)
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sh.nextInt();
        }
        int[] odd;
        if(n%2==1){
            odd = new int[n/2+1];
        }else{
            odd= new int[n/2];
        }
        int[] even = new int[n/2];
        int oddPtr=0;
        int evenPtr=0;
        for(int i =0;i<n;i++){
            if(i%2==0){
                odd[oddPtr]=arr[i];
                oddPtr++;
            }else{
                even[evenPtr]=arr[i];
                evenPtr++;
            }
        }
        sortArray(odd);
        sortArray(even);
        //printing the output 
        oddPtr=odd.length-1;
        evenPtr=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(odd[oddPtr]+" ");
                oddPtr--;
            }
            else{
                System.out.print(even[evenPtr]+" ");
                evenPtr++;
            }
        }
        sh.close();
    }
}
