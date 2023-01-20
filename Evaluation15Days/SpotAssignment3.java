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
        
        Iterator<Character> i = setOfChecks.iterator();
        char[] ch = new char[setOfChecks.size()];
        int start =0;
        
        while(i.hasNext()){
            
        }
        int result =0;

        
        return result;
    }

    public static void main(String[] args) {
        SpotAssignment3 three = new SpotAssignment3();
        String[] x = {"ceo","alco","caaeio","ceai"};
        String[] y={"ec","oc","ceo"};
        System.out.println(three.findSuperString(x,y));
    }
}
