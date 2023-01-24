import java.util.Scanner;
public class SpotAssignment2_02 {

    public static void splitArray(int[] nums){
        if(nums.length==0){
            System.out.println("The array can't be split");
        }
        else{

            int start =0;
            int end = nums.length-1;
            int forwardSum =nums[start];
            int backwardSum =nums[end];

            while(start<end){
                if(forwardSum<backwardSum){
                    start++;
                    if(start<end){
                        forwardSum += nums[start];
                    }
                }else{
                    end--;
                    if(start<end){
                        backwardSum += nums[end];
                    }
                }
            }
            if(forwardSum==backwardSum){
                System.out.println("The first splited array is ");
                for(int i =0;i<=start;i++){
                    System.out.print(nums[i]+" ");
                }
                System.out.println("\nThe second split array is ");
                for(int i =start+1;i<nums.length;i++){
                    System.out.print(nums[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sh = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sh.nextInt();

        int[] nums = new int[size];

        for(int i =0;i<size;i++){
            nums[i]=sh.nextInt();
        }

        splitArray(nums);
        sh.close();
    }
}
