//program to find character in a string word using binary search
import java.util.Scanner;
public class Problem97 {
    public static int binarySearch(char[] c, int l, int r,char search){
        if(l<r){
            int mid = (l+r)/2;
            if(c[mid]==search)
                return mid;
            else if(search>c[mid])
                l = mid+1;
            else
                r = mid-1;
            return binarySearch(c, l, r, search);
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String s ="organisation";
        //first sorting the string to do binary search
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            boolean flag = false;
            for(int j =0;j<s.length()-1-i;j++){
                if(ch[j]>ch[j+1]){
                    flag = true;
                    char temp = ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
            if(!flag)
                break;
        }
        System.out.println("The sorted string is "+ new String(ch));
        //finding a character using binary search
        System.out.println("Enter the character to search in string "+s+" using binary search:");
        char search = sh.next().charAt(0);
        int result = binarySearch(ch,0,ch.length-1,search);
        if(result==-1)
            System.out.println("The given character "+search+" is not present in the string "+s);
        else
            System.out.println("The given character "+search+" is present in the string "+s +" at the index "+result);
        sh.close();
    }
}
