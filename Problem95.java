//java program to find the given two strings are palindrome
import java.util.Scanner;
public class Problem95 {
    public static void main(String[] args) {
        Scanner sh = new Scanner (System.in);
        String s1 = sh.next();
        String s2 = sh.next();
        if(s1.length()!=s2.length()){
            System.out.println("The given two strings are not palindrome");
        }else{
            int start = 0;
            int end = s2.length()-1;
            boolean flag = true;
            while(start<end){
                if(s1.charAt(start)!= s2.charAt(end)){
                    flag = false;
                    break;
                }
                start++;
                end--;
            }
            if(flag){
                System.out.println("The given Strings "+s1+" and "+s2+" are palindrome");
            }else{
                System.out.println("The given two strings are not palindrome");
            }
        }
        sh.close();
    }
}
