import java.util.Scanner;
public class Problem52 {
    public static String revOrder(String[] s){
        String temp = s[s.length-1];
        if(s.length==1)
            return temp;
        String[] newS = new String[s.length-1];
        for(int i =0;i<s.length-1;i++){
            newS[i]= s[i];
        }
        return temp+" "+revOrder(newS);
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String[] s = sh.nextLine().split(" ");
        System.out.println(revOrder(s));
        sh.close();
    }
}
