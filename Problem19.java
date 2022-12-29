public class Problem19 {
    public static void main(String[] args) {
        int a =28;
        System.out.println(a += a++ + ++a + --a + a--);
        //a+= 28(a=29)+30(a=30)+29(a=29)+29(a=28)
    }
}
