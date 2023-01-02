//sort the characters in a word in descending
import java.util.*;
public class Problem91 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String word = sh.next();
        char[] c = word.toCharArray();
        for(int i =0;i<c.length;i++){
            boolean b = false;
            for(int j =0;j<c.length-1-i;j++){
                if(c[j]<c[j+1]){
                    b = true;
                    char temp = c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
            if(!b){
                break;
            }
        }
        System.out.println(new String(c));

        sh.close();
    }
}
