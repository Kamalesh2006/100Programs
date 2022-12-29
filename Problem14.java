import java.util.Scanner;
public class Problem14 {
    public static int areaOfRectangle(int l, int b){
        return l*b;
    }
    public static void main(String[] args){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sh.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sh.nextInt();
        System.out.println("Area of the rectangle is "+ areaOfRectangle(length, breadth));
        sh.close();
    }
}
