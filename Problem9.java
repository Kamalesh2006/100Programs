import java.util.ArrayList;

public class Problem9 {
    public static void main(String[] args){
        int[] a = {2,4,5,6,7,9,10,13};
        int[] b = {2,3,4,5,6,7,8,9,11,15};
        int aPtr =0;
        int bPtr =0;
        ArrayList<Integer> al = new ArrayList<>();
        while(aPtr<a.length && bPtr<b.length){
            if(a[aPtr]==b[bPtr]){
                al.add(a[aPtr]);
                aPtr++;
                bPtr++;
            }
            else if(a[aPtr]>b[bPtr]){
                al.add(b[bPtr]);
                bPtr++;
            }
            else if(b[bPtr]>a[aPtr]){
                al.add(a[aPtr]);
                aPtr++;
            }
        }
        if(bPtr<b.length){
            System.out.println("Bptr"+ bPtr);
            while(bPtr<b.length){
                al.add(b[bPtr]);
                bPtr++;
            }
        }
        else if(aPtr<a.length){
            System.out.println("aPtr"+ aPtr);
            while(aPtr<a.length){
                al.add(a[aPtr]);
                aPtr++;
            }
        }
        System.out.println(al);
    }
}
