public class Problem76_1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] trans= new int[arr.length][arr[0].length];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                trans[i][j]=arr[j][i];
            }
        }
        //printing the transpose of the matrix
        System.out.println("Transpose of the matrix is: ");
        for(int i =0;i<trans.length;i++){
            for(int j =0;j<trans.length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();

        }
    }
}
