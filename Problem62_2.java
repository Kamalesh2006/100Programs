public class Problem62_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] odd;
        int[] even = new int[arr.length/2];
        if(arr.length%2==1){
            odd=new int[arr.length/2+1];
        }
        else{
            odd = new int[arr.length/2];
        }
        int oddPtr=0;
        int evenPtr=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                odd[oddPtr++]=arr[i];
            }
            else{
                even[evenPtr++]=arr[i];
            }
        }
        System.out.println("The elements in odd positions are: ");
        for(int i : odd){
            System.out.print(i+" ");
        }
        System.out.println("\nThe elements in even positions are: ");
        for(int i :even){
            System.out.print(i+" ");
        }
    }
}
