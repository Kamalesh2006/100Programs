class MyArrayList{
    int size=5;
    int count=0;
    int[] arr = new int[5];
    public void insert(int a){
        if(count>size-1){
            int[] temp = arr.clone();
            size=size*2;
            arr = new int[size];
            for(int i =0;i<temp.length;i++){
                arr[i]=temp[i];
            }
        }
        arr[count]=a;
        count++;
    }
    public int delete(int a){
        int index =-1;
        for(int i =0;i<arr.length;i++){
            if(a==arr[i]){
                index=i;
            }
        }
        for(int i =index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        //if not found then return -1
        return index;
    }
    public String toString(){
        String result ="";
        for(int i =0;i<arr.length;i++){
            result = result + arr[i]+" ";
        }
        return result;
    }
}
public class MyArrayListSolution{
    public static void main(String[] args) {
        MyArrayList al = new MyArrayList();
        System.out.println("Size is "+ al.size);
        al.insert(10);
        al.insert(100);
        al.insert(1000);
        al.insert(10000);
        al.insert(100000);
        System.out.println(al.toString());
        al.insert(9);
        System.out.println("Size "+al.size);
        System.out.println(al.toString());
        al.delete(10);
        System.out.println(al.toString());

    }
}
