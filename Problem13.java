import java.util.*;
public class Problem13 {
    public static int areaOfSquare(int side){
        return side*side;
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int sideSize = sh.nextInt();
        System.out.println("Area of the sqaure of size "+ sideSize + " is " + areaOfSquare(sideSize));
        sh.close();

    }
}
