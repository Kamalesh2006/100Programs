import java.util.ArrayList;
public class Problem89 {
    public static void main(String[] args) {
        String s = "Strings are defined as an array of characters.";
        ArrayList<String> al = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()){
                i++;
                continue;
            }
            String temp ="";
            while(i<s.length() && s.charAt(i)!=' '){
                temp = temp + s.charAt(i);
                i++;
            }
            al.add(temp);
        }
        for(String s1 : al){
            System.out.println(s1);
        }
    }
}
