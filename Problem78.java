public class Problem78 {
    public static void main(String[] args) {
        int[][] arr1 = {{2,1,3},
                        {5,6,8},
                        {9,0,4}};
        int[][] arr2 = {{4,3,2},
                        {5,7,3},
                        {7,5,6}};
        int[][] sub = new int[arr1.length][arr1[0].length];
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sub[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        //printing the subtracted array
        for(int[] in: sub){
            for(int i: in){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
