//check if a string is substring of another string
import java.util.Scanner;
public class Problem59 {
    public static int contains(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int start=0;
        int index =0;
        boolean flag = false;
        for(int i =0;i<c1.length-c2.length;i++){
            if(c1[i]==c2[start]){
                for(int j=1;j<c2.length;j++){
                    if(c1[i+j]==c2[j]){
                        flag =true;
                        continue;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    index = i;
                    break;
                }
            }
        }
        if(flag){
            return index;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s1 = sh.next();
        String s2 = sh.next();
        System.out.println(contains(s1, s2));
        sh.close();
    }
}
