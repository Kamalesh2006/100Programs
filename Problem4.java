import java.util.*;
public class Problem4 {
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        int num1 = sh.nextInt();
        int num2 = sh.nextInt();

        //bitwise | or operator
        System.out.println("num1|num2 = " +(num1|num2));
        //bitwise & and operator
        System.out.println("num1&num2 = "+ (num1&num2));
        //bitwise ^ exor operator
        System.out.println("num1^num2 = " +(num1^num2));
        //bitwise ~ negation operator
        System.out.println("~num1 = "+(~num1));
        sh.close();
    }
}
