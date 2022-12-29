import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int num = sh.nextInt();
        int temp = num;
        int reverse=0;
        while(temp>0){
            int rem = temp%10;
            reverse = reverse*10 + rem;
            temp /= 10;
        }
        System.out.println(num +"-"+reverse +"="+ " "+(num-reverse));
        sh.close();
    }
}
