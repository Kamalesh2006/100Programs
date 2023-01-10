class Solution {
    public String intToRoman(int num) {
        String result ="";
        while(num>0){
            if(num>=1000){
                result=result+"M";
                num -=1000;
            }
            else if(num>=500 && num<1000){
                if(num>=900){
                    num=num-900;
                    result = result + "CM";
                }else{
                result=result+"D";
                num -=500;
                }
            }
            else if(num>=100 && num<500){
                if(num>=400){
                    result= result+"CD";
                    num=num-400;
                }else{
                result=result+"C";
                num -=100;
                }
            }
            else if(num>=50 && num<100){
                if(num>=90){
                    result=result+"XC";
                    num=num-90;
                }else{
                result = result+"L";
                num=num-50;
                }
            }
            else if(num>=10 && num<50){
                if(num>=40){
                    result = result+"XL";
                    num=num-40;
                }else{
                result = result+"X";
                num = num-10;
                }
            }
            else if(num>=5 && num<10){
                if(num==9){
                    result=result+"IX";
                    num=num-9;
                }else{
                result = result+"V";
                num=num-5;
                }
            }
            else if(num>0 && num<5){
                if(num==4){
                    result= result+"IV";
                    num=num-4;
                }else{
                    result = result +"I";
                    num=num-1;
                }
            }
        }
        return result;
    }
}
