//add two matrices
public class Problem73_1 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] arr2 = {{8,9,7},
                        {3,4,5},
                        {2,1,4}};
        int[][] sum = new int[arr1.length][arr1[0].length];
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1[0].length;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        for(int[] a: sum){
            for(int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
