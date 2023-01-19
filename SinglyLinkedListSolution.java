class LinkedListIndexOutOfBoundsException extends Exception{

}

class ListNode {
    //singly linked list node

    int data;
    ListNode next;

    ListNode(int data){
        //constructor to initialize the instance variable

        this.data=data;
        next=null;

    }

    public static ListNode insertData(ListNode head,int data, int pos){
        //insert function will insert the node at the specified index

        ListNode temp = new ListNode(data);
        ListNode iterate = head;
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
        }else{
            temp.next=iterate.next;
            iterate.next=temp;
        }
        return head;
    
    }

    public static ListNode deleteByPosition(ListNode head, int pos) throws LinkedListIndexOutOfBoundsException{

        ListNode iterate = head;
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

    public static void print(ListNode head){

        ListNode iterate = head;

        while(iterate!=null){

            System.out.println(iterate.data);
            iterate=iterate.next;

        }

    }
    

}

public class SinglyLinkedListSolution{

    public static void main(String[] args)throws LinkedListIndexOutOfBoundsException{

        ListNode head = new ListNode(10);
        head = ListNode.insertData(head,100,2);
        head=ListNode.insertData(head, 10000,3);
        head=ListNode.insertData(head, 0, 1);
        head = ListNode.insertData(head, 20, 2);
        ListNode.print(head);
        head = ListNode.deleteByPosition(head, 5);
        ListNode.print(head);
        
    }
}
