class Solution {
    public List<String> printVertically(String s) {
        int length  = s.split(" ").length;
        String[] sArr = s.split(" ");
        int maxLength = 0;
        for(String ele: sArr){
            if(maxLength<ele.length()){
                maxLength = ele.length();
            }
        }
        List<String> l = new ArrayList<>();
        
        for(int i=0;i<maxLength;i++){
            String temp="";
            for(int j =0;j<sArr.length;j++){
                if(sArr[j].length()==0){
                    sArr[j] = " ";
                }
                if(j==0){
                    temp = temp+sArr[j].charAt(0);
                }
                else{
                    temp=temp+sArr[j].charAt(0);
                }
                
                sArr[j]=sArr[j].substring(1,sArr[j].length());
            }
            l.add(temp.stripTrailing());
        }
        return l;
    }
}
