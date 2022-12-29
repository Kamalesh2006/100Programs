public class Problem20 {
    public static void main(String[] args) {
        int x = 5;
        x = x++ * 2 + 3 * --x;
        // 5(x=6)*2 +3 * 5(x=5)
        // 10+15
        //25
        System.out.println(x);
    }
}
