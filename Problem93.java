//program to sort the characters in a word in descending using recursion
import java.util.Scanner;
public class Problem93 {
    public static int partition(char[] c, int lb, int ub){
        char pivot = c[lb];
        int pivotPtr = lb;
        while(lb<ub){
            while(lb<ub && c[lb]<=pivot){
                lb++;
            }
            while(lb<ub && c[ub]>pivot){
                ub--;
            }
            char temp = c[lb];
            c[lb]= c[ub];
            c[ub]= temp;
        }
        char t = c[ub];
        c[ub]= pivot;
        c[pivotPtr]= t;
        return ub;
    }
    public static void quickSort(char[] c, int lb, int ub){
        if(lb<ub){
            int p = partition(c, lb, ub);
            quickSort(c, lb, p-1);
            quickSort(c, p+1, ub);
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s = sh.next();
        char[] c = s.toCharArray();
        quickSort(c,0,c.length-1);
        System.out.println(new String(c));
        sh.close();
    }
}
