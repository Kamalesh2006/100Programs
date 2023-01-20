import java.util.Arrays;

public class SpotAssignment4 {
    /**
     * @param denominations it is an int array of different denominations
     * @param totalMoney it is the total money that is needed to be achieved by using denominations combinations
     * @return int it returns the minimum coins count of different denominations needed to obtain the money
     */
    public int minimumCoins(int[] denominations, int totalMoney){
        
        Arrays.sort(denominations);
        int dPtr = denominations.length-1;    //denominations pointer to traverse from maximum denominations to lesser
        int count =0;

        while(totalMoney>0 && dPtr>=0){

            if(totalMoney-denominations[dPtr]>=0){
                totalMoney = totalMoney-denominations[dPtr];
                count++;
            }

            else {
                dPtr--;
            }

        }

        if(totalMoney==0)
            return count;
        else   
            return -1;

    }

    public static void main(String[] args) {
        
        int[] arr = {5,2,1,10};
        int totalMoney = 28;
        
        SpotAssignment4 four = new SpotAssignment4();
        System.out.println(four.minimumCoins(arr, totalMoney));

    }
}
