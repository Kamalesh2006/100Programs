class Solution {
    public int[][] merge(int[][] intervals) {
        int row=intervals.length;
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i+1][0]<=intervals[i][1]){
                intervals[i+1][0]=Math.min(intervals[i][0],intervals[i+1][0]);
                intervals[i+1][1]=Math.max(intervals[i+1][1],intervals[i][1]);
                intervals[i][0]=0;
                intervals[i][1]=0;
                row--;
            }
        }
        int[][] result = new int[row][2];
        row =0;
        for(int i =0;i<intervals.length;i++){
            if(intervals[i][0]==0 && intervals[i][1]==0){
                continue;
            }
            result[row][0]=intervals[i][0];
            result[row][1]=intervals[i][1];
            row++;
        }
        return result;
    }
}
