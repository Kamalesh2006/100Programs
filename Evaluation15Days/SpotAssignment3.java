import java.util.*;
public class SpotAssignment3 {
    /**
     * 
     * @param words it is array of strings that needs to be checked for superstring
     * @param check it is array of substrings that need to be present in each string to make it a superstring
     * @return int the number of superstrings present in the words array
     */
    public int findSuperString(String[] words, String[] checks){
        Set<Character> setOfChecks = new HashSet<>();
        for(String check: checks){
            for(Character c : check.toCharArray()){
                setOfChecks.add(c);
            }
        }

        int result =0;
        Set<Character> s= new HashSet<>();
        for(String word: words){
            s=new HashSet<>(setOfChecks);
            for(int i =0;i<word.length()&& s.size()>0;i++){
                if(s.contains(word.charAt(i))){
                    s.remove(word.charAt(i));
                }   
            }
            if(s.size()==0){
                result++;
            }
        }

        
        return result;
    }

    public static void main(String[] args) {
        SpotAssignment3 three = new SpotAssignment3();
        String[] x = {"ceo","alco","caaeio","ceai","acoeaaco"};
        String[] y={"ec","oc","ceo"};
        System.out.println(three.findSuperString(x,y));
    }
}
