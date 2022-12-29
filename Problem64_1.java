public class Problem64_1 {
    public static void main(String[] args) {
        int[] arr ={11,12,13,14,15,16};
        int[] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println("Copied array");
        for(int i =0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
