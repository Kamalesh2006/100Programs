import java.util.Scanner;
public class Problem55 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n =sh.nextInt();
        for(int i =1;i<=n;i++){
            if(i==1 || i==n){
                for(int j =1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
            }
            System.out.println();
        }
        sh.close();
    }
}
