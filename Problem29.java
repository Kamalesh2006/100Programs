//program to check whether a character is a vowel or consonant
import java.util.Scanner;
public class Problem29 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        char c = sh.next().toLowerCase().charAt(0);
        if(c =='a' || c=='e'|| c=='i'|| c=='o'||c=='u'){
            System.out.println("The given character "+c+" is vowel" );
        }
        else{
            System.out.println("The given character "+c+" is consonant");
        }
        sh.close(); 
    }
}
