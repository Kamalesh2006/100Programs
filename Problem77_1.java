//sorting an array using quick sort
public class Problem77_1 {
    public static int partition(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int start = lb;
        while(lb<ub){
            while(arr[lb]<=pivot){
                lb++;
            }
            while(arr[ub]>pivot){
                ub--;
            }
            if(lb<ub){
                int temp = arr[lb];
                arr[lb]= arr[ub];
                arr[ub]= temp;
            }
        }
        int temp = arr[ub];
        arr[ub]= pivot;
        arr[start]=temp;
        return ub;
    }
    public static void quickSort(int[] arr,int lb, int ub){
        if(lb<ub){
            int p = partition(arr, lb, ub);
            quickSort(arr, lb, p-1);
            quickSort(arr, p+1,ub );
        }
    }
    public static void printArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,4,12,44,84,36};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

        
    }
}
