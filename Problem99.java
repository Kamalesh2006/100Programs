//convert all characters from lower case to upper case
import java.util.Scanner;
public class Problem99 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s = sh.next();
        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                c[i]= (char)(c[i]-32);
            }
        }
        s = new String(c);
        System.out.println(s);
        sh.close();
    }
}
