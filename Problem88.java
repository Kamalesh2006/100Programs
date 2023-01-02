//convert a paragraph to string array using string functions
public class Problem88 {
    public static void main(String[] args) {
        String s = "Strings are defined as an array of characters.";
        String[] sArr = s.split(" ");
        for(String item: sArr){
            System.out.println(item);
        }
    }
}
