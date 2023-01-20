import java.util.*;

public class SpotAssignment2 {

    /***
     * 
     * @param nums int array of numbers
     * @param splitSum  used to split the array based on the splitsum
     * @return void
     */

    public void equalSumSubArray(int[] nums, int splitSum){

        int checkSum = 0;
        List<List<Integer>> arrList = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        int first = 0; //to pop out the element if the checksum exceeds the split sum
        int ptr = 0; //to traverse the nums array
    
        while(ptr<nums.length){
            if(checkSum<splitSum){
                arr.add(nums[ptr]);
                checkSum = checkSum + nums[ptr];
                ptr++;
            }
            
            if(checkSum>splitSum){
                int value = arr.remove(first);
                checkSum = checkSum - value;
            }
            if(checkSum == splitSum){
                arrList.add(arr);
                arr = new ArrayList<>();
                checkSum =0;

                /*if queue required

                 * arrList.add(new ArrayList<>(arr));
                 * int value = arr.remove(first);
                 * checkSum = checkSum - value;
                 */
            }

        }

        for(List<Integer> array: arrList){
            System.out.println(array);
        }
    }

    public static void main(String[] args) {

        Scanner sh = new Scanner(System.in);
        SpotAssignment2 two = new SpotAssignment2();

        int[] arr = {1,2,3,4,5};
        int splitSum =9;
        two.equalSumSubArray(arr,splitSum);

        sh.close();

    }
}
