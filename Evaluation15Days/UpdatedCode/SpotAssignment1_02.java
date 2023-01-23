import java.util.Stack;
import java.util.Scanner;

public class SpotAssignment1_02 {

    /**
     * 
     * @param expression of String type 
     * @return boolean if the string is
     */
    public boolean isValid(String expression){

        Stack<Character> bracesStack = new Stack<>(); //braces are pushed and popped out of the stack
        char[] ch = expression.toCharArray();
        int count =0;

        for(int i =0;i<expression.length()-1;i++){

            if(ch[i]==' '){
                continue;
            }

            //adding the brackets to the bracesStack
            if(ch[i]=='{' || ch[i]=='('|| ch[i]=='['){
                if(ch[i+1]=='}'||ch[i+1]==')'|| ch[i+1]==']'){
                    return false;
                }
                bracesStack.push(ch[i]);
            }

            //checking if the corresponding closing brackets are there in the bracesStack
            else if(ch[i]=='}'||ch[i]==')'|| ch[i]==']'){
                if(bracesStack.size()==0){
                    return false;
                }
                else{
                    if((ch[i]=='}'  && bracesStack.peek()=='{')||(ch[i]==']' && ch[i]=='[')|| (ch[i]==')' && bracesStack.peek()=='(')){
                        bracesStack.pop();
                    }
                    else{
                        System.out.println("hi");
                        return false;
                    }
                }
            }

            //checking if the character is followed by operators
            else if ((ch[i]>='a' && ch[i]<='z' )&& (ch[i+1]=='+'||ch[i+1]=='-' || ch[i+1]=='*'||ch[i+1]=='/')){
                count++;
            }
            else if((ch[i]=='+'|| ch[i]=='-'|| ch[i]=='*'|| ch[i]=='/' )&& (ch[i+1]>='a' || ch[i+1]<='z')){
                count--;
            }

            //checking if the characters are followed by another character
            else if ((ch[i]>='a' && ch[i]<='z')&& (ch[i+1]>='a' && ch[i+1]<='z') ){
                return false;
            }

            //checking if the characters are followed by brackets
            else if(ch[i]>='a' && ch[i]<='z' &&(ch[i+1]==')' || ch[i+1]=='}' || ch[i+1]==']')){
                if(count!=0){
                    return false;
                }
            }
        }
        //this is the to check the last character of the expression
        int end = ch.length-1;
        if(ch[end]=='}'||ch[end]==')'|| ch[end]==']'){
            if(bracesStack.size()==0){
                return false;
            }
            else{
                if((ch[end]=='}'  && bracesStack.peek()=='{')||(ch[end]==']' && ch[end]=='[')|| (ch[end]==')' && bracesStack.peek()=='(')){
                    bracesStack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return bracesStack.isEmpty()&& count==0;
    }


    public static void main(String[] args) {
        
        Scanner sh = new Scanner(System.in);
        String expression = sh.nextLine();
        SpotAssignment1_02 oneTwo = new SpotAssignment1_02();

        System.out.println(oneTwo.isValid(expression));
        sh.close();
    }
}
