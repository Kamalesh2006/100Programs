//to find the given two strings are anagram to each other
import java.util.Scanner;
import java.util.Arrays;
public class Problem94 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s1 = sh.next();
        String s2 = sh.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length!= c2.length){
            System.out.println("The given string is not anagram to each other");
        }
        else{
            boolean[] b = new boolean[c1.length];
            Arrays.fill(b,false);
            for(int i =0;i<c1.length;i++){
                for(int j =0;j<c2.length;j++){
                    if(b[i]==false && c1[i]==c2[j]){
                        b[i]=true;
                    }
                }
            }
            boolean flag = false;
            for(int i =0;i<b.length;i++){
                if(b[i]==false){
                    flag = false;
                    System.out.println("The given string is not anagram to each other");
                    break;
                }else{
                    flag = true;
                }
            }
            if(flag){
                System.out.println("The given string "+s1+" is anagram to "+s2);
            }
        }
        sh.close();
    }
}
