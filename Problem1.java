import java.util.*;
public class Problem1{
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int num = sh.nextInt();
        //subtraction table
        for(int i = 1; i<= num;i++){
            for( int j=num;j>=1;j--){
                System.out.print((j-i) + " ") ;
            }
            System.out.println();
        }
        //multiplication table
        for(int i =1;i<=num;i++){
            System.out.println(i+"*"+num +"=" + i*num);
        }
        sh.close();
    }
}