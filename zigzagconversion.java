class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s.length()==1 || s.length()==0){
            return s;
        }
        int jump1 = numRows*2 -2;
        int jump2 = 0;
        String result="";
        for(int i =0;i<numRows && i<s.length();i++){
            int diff = i;
            result = result+s.charAt(i);
            while(diff<s.length()){
                if(jump1!=0){
                    diff = diff+jump1;
                    if(diff>=s.length())
                        break;
                    result = result + s.charAt(diff);
                }
                if(jump2!=0){   
                    diff = diff+jump2;
                    if(diff>=s.length()){
                        break;
                    }
                    result = result + s.charAt(diff);
                }
            }
            jump1 = jump1-2;
            jump2= jump2+2;
        }
        return result;
    }
}
