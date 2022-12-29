import java.util.Scanner;
public class Problem53 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        String s = sh.next();
        char[] c = s.toCharArray();
        char temp = '.';
        for(int i =0;i<c.length;i++){
            if(c[i]>='a'&&c[i]<='z'){
                temp = c[i];
            }
            int n =0;
            if(c[i]>='0' && c[i]<='9'){
                n=Character.getNumericValue(c[i]);
                if(i<c.length-1){
                    if(c[i+1]>='0'&& c[i+1]<='9'){
                        n=n*10+Character.getNumericValue(c[i+1]);
                        i++;
                    }
                }
                for(int j =0;j<n;j++){
                    System.out.print(temp+"");
                }
            }

        }
        sh.close();
    }
}
