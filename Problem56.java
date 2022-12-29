//to make a pyramid pattern with number increased from 1
import java.util.Scanner;
public class Problem56 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        //to count the no of rows
        int row=1;
        int sum =0;
        while(sum<n){
            for(int j=1;j<=row;j++){
                sum=sum+1;
            }
            if(sum==n){
                break;
            }
            row++;   
        }
        //printing pyramid
        int count=1;
        for(int i =row;i>0;i--){
            for(int j =i;j>1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=row - i+1;k++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sh.close();
    }
}
