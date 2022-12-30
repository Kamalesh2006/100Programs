import java.util.Scanner;
public class Problem69_2 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] newArr= new int[arr.length];
        if(n>arr.length)
            n= n%arr.length;
        for(int i =0;i<arr.length;i++){
            newArr[i]= arr[arr.length-n];
            n--;;
            if(n==0)
                n=arr.length;
        }

        //printing the new array
        for(int i:newArr){
            System.out.print(i+" ");
        }
        sh.close();
    }
}
