

class SinglyListNode {
    //singly linked list node
    
    private int data;
    private SinglyListNode next;

    /**
     * 
     * @param data to initialise the instance data
     */
    SinglyListNode(int data){

        this.data=data;
        next=null;

    }
    /**
     * 
     * @param head Head reference
     * @param data data needed to be inserted
     * @param pos position starting from 1 
     * @return SinglyListNode it returns head reference
     */
    public static SinglyListNode insertData(SinglyListNode head,int data, int pos){

        SinglyListNode temp = new SinglyListNode(data);
        SinglyListNode iterate = head;
        pos--;
        boolean iteratedOnce = false;
        //this condition is checked because if not iterated once then the user is trying to insert before head.

        while(pos>0){
            iteratedOnce = true;
            if(iterate.next==null){
                //add node at the end of the head node if the specified index is out of bounds
                break;
            }

            iterate = iterate.next;
            pos--;
            
        }

        if(!iteratedOnce && pos<=0){
            temp.next=head;
            head = temp;
        }
        else{
            temp.next=iterate.next;
            iterate.next=temp;
        }

        return head;
    
    }
    /**
     * 
     * @param head SinglyListNode refering to head of the linked list
     * @param pos position of node to be removed starting from 1
     * @return SinglyListNode type
     * @throws LinkedListIndexOutOfBoundsException thrown whenever the position is out of bounds 
     */
    public static SinglyListNode deleteByPosition(SinglyListNode head, int pos) throws LinkedListIndexOutOfBoundsException{

        SinglyListNode iterate = head;
        pos--;
        while(pos>1){

            if(iterate.next.next==null){
                throw new LinkedListIndexOutOfBoundsException();
            }
            iterate = iterate.next;
            pos--;
            
        }
        if(pos==0){
            head = head.next;
        }else{
            iterate.next=iterate.next.next;
        }
        return head;
        
    }
    /**
     * 
     * @param head pass the head of SinglyListNode reference to print 
     * @return void 
     */
    public static void print(SinglyListNode head){

        SinglyListNode iterate = head;

        while(iterate!=null){

            System.out.print(iterate.data+" ");
            iterate=iterate.next;

        }
        System.out.println();
    }
    

}


