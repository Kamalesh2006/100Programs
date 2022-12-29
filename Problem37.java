public class Problem37 {
    public static void main(String[] args) {
        int[] arr ={10,2,5,7,44,23,56,89};
        for(int i =0;i<arr.length;i++){
            //checking the position is odd and array index starts at 0 so checking of even condtion in array
            if(i%2==0){
                System.out.print("Element positioned at "+(i+1)+" is "+ arr[i]);
            }
            System.out.println();
        }
    }
}
