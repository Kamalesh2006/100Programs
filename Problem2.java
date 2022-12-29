import java.util.*;
public class Problem2 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        char c = sh.next().charAt(0);
        for(int i=c;i<='Z';i++){
            System.out.print((char)i);
        }
        sh.close();
    }
}
