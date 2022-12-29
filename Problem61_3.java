import java.util.Arrays;
import java.util.Collections;

import javax.sound.sampled.SourceDataLine;
public class Problem61_3 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        Arrays.sort(arr,Collections.reverseOrder());
        for(Integer i: arr){
            System.out.print(i+" ");
        }
    }
}
