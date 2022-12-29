import java.util.Scanner;
public class Problem33 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        char c = sh.next().charAt(0);
        if(c>='a' && c<='z'|| c>='A' && c<='Z'){
            System.out.println("The given character "+c+" is alphabet");
        }else{
            System.out.println("The given character "+c+" is not alphabet");
        }
        sh.close();
    }
}
