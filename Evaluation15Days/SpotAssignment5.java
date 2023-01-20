import java.util.Scanner;
import java.util.*;

public class SpotAssignment5 {
    /**
     * 
     * @param inputString input string to match with the reference string
     * @param refString reference String to check with the input String
     * @return void 
     */

    public void checkStringWithRef(String inputString,String refString){

        char[] inputArr = inputString.toLowerCase().toCharArray();
        int inputArrLength = inputArr.length;

        //for removing duplicate characters in the reference string 
        List<Character> refArr = new ArrayList<>();
        List<Character> resultReference = new ArrayList<>();
        String tempReferenceString = refString.toLowerCase();

        for(int i = 0;i<refString.length();i++){

            if(!refArr.contains(refString.charAt(i))){

                refArr.add(tempReferenceString.charAt(i));
                resultReference.add(refString.charAt(i));

            }

        }

        int refArrLength = refArr.size();
        int[] refArrCount = new int[refArr.size()];
        
        for(int i=0;i<inputArrLength;i++){

            for(int j=0;j<refArrLength;j++){

                if(refArr.get(j)==inputArr[i]){
                    refArrCount[j]=refArrCount[j]+1;
                }

            }

        }

        for(int i =0;i<refArrLength;i++){
            System.out.println(resultReference.get(i)+" "+refArrCount[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sh = new Scanner(System.in);
        String inputString = sh.nextLine();
        String refString = sh.nextLine();
        SpotAssignment5 five = new SpotAssignment5();
        five.checkStringWithRef(inputString,refString);
        sh.close();
    }
}
