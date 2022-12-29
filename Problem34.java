import java.util.Scanner;
public class Problem34{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int sum = n*(n+1)/2;
        int max =0,temp = sum;
        while(temp>0){
            int rem = temp%10;
            if(rem>max){
                max = rem;
            }
            temp = temp/10;
        }
        System.out.println("The sum of natural numbers till "+n+" is " +sum);
        System.out.println("The max digit in the "+sum +" is "+max);
        s.close();
    }
}