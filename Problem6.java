
public class Problem6 {
    public static void main(String[] args) {
        int num1 =101;
        int temp =num1;
        for(int i =1;i<=4;i++){
            System.out.println("Group "+i);
            int n=5;
            while(n>0){
                System.out.println(temp);
                temp++;
                n--;
            }
            System.out.println();
        }
    }
}
