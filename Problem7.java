import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s = sh.nextLine();
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(i==j){
                    System.out.print(temp);
                }
                else if(i+j==(s.length()-1)){
                    System.out.print(temp);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sh.close();
    }
}
