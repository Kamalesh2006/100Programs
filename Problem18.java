public class Problem18 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        // ++a-b--
        System.out.println(++a-b--); //the value of a is 11 and b is 19


        // a%b++ increment operator has higher precedence than modulo operator 
        a=10;
        b=3;
        System.out.println(a%b++); //b will become 4 after substituition

        //a* = b+5 this is similar to a = a*b+5 and '*=' assignment operator has lower precedence than '+'
        a = 5;
        b = 2;
        System.out.println(a*= b +5);   //a *= 7 => a = a*7 

        //69>>>2 this is a unsigned right shift operator which means it will insert zero at the start no matter the sign of the integer
        System.out.println(69>>>2); //so 1000101 will become 0010001
    }
}
