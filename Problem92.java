import java.util.Arrays;

public class Problem92 { 
    public static int partition(String[] s,int lb, int ub){
        String start = s[lb];
        int startPtr=lb;
        while(lb<ub){
            while(lb<ub && s[lb].compareTo(start)<=0){
                lb++;
            }
            while(s[ub].compareTo(start)>0){
                ub--;
            }
            if(lb<ub){
                String temp = s[lb];
                s[lb]=s[ub];
                s[ub]=temp;
            }
        }
        String t = s[ub];
        s[ub]= s[startPtr];
        s[startPtr]=t;
        return ub;
        
    }
    public static void quickSort(String[] s,int lb, int ub){
        if(lb<ub){
            int p = partition(s, lb, ub);
            quickSort(s, lb, p-1);
            quickSort(s, p+1, ub);
        }
    }
    public static void main(String[] args) {
        String[] s = {"kamalesh","vishnu","aravinth","sangeetkumar","pradeep"};
        quickSort(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }
}
