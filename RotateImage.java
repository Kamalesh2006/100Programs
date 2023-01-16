class Solution {
    public void rotate(int[][] matrix) {
        //taking the transpose first
        int temp =0;
        for(int i=0;i<matrix.length;i++){
            for(int j =i;j<matrix[0].length;j++){
                if(i==j){
                    continue;
                }
                else{
                    temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
                
            }
        }
        int startPtr=0;
        int endPtr = matrix.length-1;
        while(startPtr<endPtr){
            //interchanging the coloumn elements
            for(int i=0;i<matrix.length;i++){
                temp = matrix[i][startPtr];
                matrix[i][startPtr]=matrix[i][endPtr];
                matrix[i][endPtr]=temp;
            }
            startPtr++;
            endPtr--;
        }

    }
}
