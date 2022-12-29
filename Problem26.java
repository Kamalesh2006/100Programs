//Program to demonstrate the working of keyword long
public class Problem26 {
    public static void main(String[] args) {
        //int n = 88732384739348;
        //integer number too large
        long n = 88732384739348L;
        System.out.println(n);

        // long l = 3.4f;
        // incompatible types: float to long
        // System.out.println(l);

        long l = 'a';
        System.out.println(l);

        System.out.println("Integer size is "+Integer.SIZE/8);
        System.out.println("Long size is "+Long.SIZE/8);
    }
}
