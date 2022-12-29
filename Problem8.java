public class Problem8 {
    static int x =10;
    static int  m1(){
        System.out.println("Inside m1 block");
        return x;
    }
    static{
        System.out.println("Inside static block");
        x =999;
    }
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(m1());
    }
}
