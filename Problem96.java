//to find a character in a string by linear search
import java.util.Scanner;
public class Problem96 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        String word = "Welcome to Zoho";
        System.out.println("Enter the character to search in word:");
        char c = sh.next().charAt(0);
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)==c){
                System.out.println("The character '"+c+"' is present");
                break;
            }
        }
        sh.close();
    }
}
