class Solution {
    public int divide(int dividend, int divisor) {

        /*This function will use the concept of (divisor*quotient) +reminder = dividend

        (divisor*quotient) - dividend >=0

        We are increasing the quotient 2^n times untill the quotient*divisor is lesser than
        or equal to dividend
        
        To increase the quotient 2^n times we are left shifting the absolute value of divisor*/

        if(dividend==Integer.MIN_VALUE && divisor==-1 )
            return Integer.MAX_VALUE;

        int dividendAbs = Math.abs(dividend);
        int divisorAbs=Math.abs(divisor);
        boolean sign = dividend>0 && divisor >0||divisor<0 && dividend<0?true:false;
        int quotient =0;

        while(dividendAbs-divisorAbs>=0){

            int count =0;

            while(dividendAbs-(divisorAbs<<1<<count)>=0){
                //this is similar to divisor*(2^n)
                count++;
            }

            quotient = quotient+(1<<count);
            dividendAbs= dividendAbs-((1<<count)*divisorAbs);

        }

        return sign?quotient:-quotient;

    }
}
