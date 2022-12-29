//reverse the number without the use of string functions
import java.util.Scanner;
public class Problem51 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int temp =n,reverse=0;
        while(temp>0){
            int rem = temp%10;
            reverse = reverse*10 + rem;
            temp = temp/10;
        }
        System.out.println("The number in reverse order is : "+reverse);
        sh.close();
    }
}
