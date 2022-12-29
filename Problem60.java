import java.util.Scanner;
public class Problem60 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Input the number of terms: ");
        int n = sh.nextInt();
        String s ="1";
        int start =1;
        int sum =0;
        while(start<=n){
            String temp = s.repeat(start);
            int num = Integer.parseInt(temp);
            sum += num;
            if(start<n)
                System.out.print(temp + " + ");
            else
                System.out.print(temp + "\nThe Sum is : "+ sum);

            start++;
        }
        sh.close();
    }
}
