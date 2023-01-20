import java.util.Scanner;

public class SpotAssignment1 {

     public String isValid(String expression){

        char[] ch = expression.toCharArray();
        boolean valid = false;
        int length = ch.length-1;

        for(int i =0;i<ch.length-1;i++){

            valid = false;

            if(ch[i]==' '){
                continue;
            }

            if(ch[i]=='(' && ch[i+1]>='a'&& ch[i+1]<='z'){
                valid = true;
            }

            else if((ch[i]>='a' && ch[i]<='z') && (ch[i+1]=='+' ||ch[i+1]=='-'||ch[i+1]=='*'||ch[i+1]=='/' )){
                valid = true;
            }

            else if((ch[i]=='+' ||ch[i]=='-'||ch[i]=='*'||ch[i]=='/' )&&(ch[i+1]>='a' && ch[i+1]<='z') ){
                valid = true;
            }

            else if(ch[i]>='a'&& ch[i]<='z' && ch[i+1]==')'  ){
                valid = true;
            }

            else if((ch[i]==')'&& ch[i+1]=='(' )) {
                valid = true;
            }

            else if(ch[i]==')' && (ch[i+1]=='+' ||ch[i+1]=='-'||ch[i+1]=='*'||ch[i+1]=='/' )){
                valid = true;
            }

            else if((ch[i]=='+' ||ch[i]=='-'||ch[i]=='*'||ch[i]=='/' )&&ch[i+1]=='('){
                valid = true;
            }

            if(!valid){
                return "Invalid";
            }

        }

        //Checking if the last element is correct
        if(ch[length]=='+' || ch[length]=='-' || ch[length]=='*' || ch[length]=='/' || ch[length]=='('){
            return "Invalid";
        }


        return "Valid";
     }


     public static void main(String[] args) {

        Scanner sh = new Scanner(System.in);
        SpotAssignment1 one = new SpotAssignment1();

        String input = sh.next();

        System.out.println(one.isValid(input));


        sh.close();
     }
}
