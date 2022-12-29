import java.util.*;
public class Problem5 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        char c = sh.next().charAt(0);
        int index = c-'A' +1;
        for(int i =index;i>0;i--){
            String temp = ""+c;
            temp = temp.repeat(i);
            System.out.println(temp);
            c = (char)(c-1);
        }
        sh.close();
    }
    
}
