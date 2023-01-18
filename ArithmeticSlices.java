class Solution {

    public int numberOfArithmeticSlices(int[] nums) 
    {
        //base condition 
        //since contiguous subarray requires minimum length of 3 to determine the slices
        if(nums.length<3){

            return 0;

        }

        
        int count =0;

        for(int i=0;i<nums.length-2;i++){

            for(int j=i+1;j<nums.length;j++){

                if((j+1)<nums.length && (nums[j]-nums[j-1])==(nums[j+1]-nums[j])){

                    count++;

                }else{

                    break;
                    //break if there isn't any contiguous difference
                }

            }

        }
        return count;

    }

}
