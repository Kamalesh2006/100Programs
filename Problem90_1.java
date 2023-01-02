import java.util.*;
public class Problem90_1 {
    public static void main(String[] args) {
        String[] s = {"kamalesh","vishnu","aravinth","sangeetkumar","pradeep"};
        for(int i =0;i<s.length;i++){
            boolean flag = false;
            for(int j=i+1;j<s.length;j++){
                if(s[i].compareTo(s[j])>0){
                    flag = true;
                    String temp = s[i];
                    s[i] = s[j];
                    s[j]=temp;
                }
            }
            if(!flag)
                break;
        }
        System.out.println(Arrays.toString(s));
    }
}
