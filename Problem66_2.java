import java.util.Scanner;
public class Problem66_2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the number of times to left rotate the array: ");
        int n = sh.nextInt();
        int[] newArr = new int[arr.length];
        if(n/arr.length!=0) n=n%arr.length;
        for(int i =0;i<arr.length;i++){
            newArr[i]= arr[n];
            if(n==arr.length-1){
                n=0;
                continue;
            }

            n++;
        }
        //printing the newArray
        for(int i : newArr){
            System.out.print(i+" ");
        }
        sh.close();
    }
}
