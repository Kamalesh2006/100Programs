public class Problem23 {
    public static void main(String[] args) {
        int x =5;
        int x1 = ++x - x++ + -x;
        //x1 = 6(x=6) - 6(x=7) + -7
        //x1 = 6-6-7
        //x1 = -7
        System.out.println(x1);

    }
}
