class Solution {
    public void sortColors(int[] nums) {
       int start =0;
       int end = nums.length-1;
       int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                if(mid==start){
                    mid++;
                    start++;
                }
                else if(mid>start){
                    nums[mid]=nums[start];
                    nums[start]=0;
                    start++;
                }
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                nums[mid]=nums[end];
                nums[end]=2;
                end--;
            }
        }
    }
}
