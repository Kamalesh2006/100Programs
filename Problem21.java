public class Problem21 {
    public static void main(String[] args) {
        int y = 10;
        int z =  (++y * (y++ + 5));
        //11*(11(y=12)+5)
        //11*16
        //176
        System.out.println(z);
    }
}
