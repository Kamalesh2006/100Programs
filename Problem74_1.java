public class Problem74_1 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] arr2 = {{4,3,2},
                        {8,7,6},
                        {5,4,6}};
        int[][] prod = new int[arr1.length][arr1[0].length];
        // number of rows and columns must be equal
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                int rowSum =0;
                for(int k =0;k<arr1.length;k++){
                    rowSum += arr1[i][k] * arr2[k][j];
                }
                prod[i][j]=rowSum;
            }
        }
        //printing the product of two matrix
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
