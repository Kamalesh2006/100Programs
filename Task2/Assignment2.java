public class Assignment2 {

    public static void main(String[] args)throws LinkedListIndexOutOfBoundsException{

        //Singly Linked List
        SinglyListNode head = new SinglyListNode(10);
        head = SinglyListNode.insertData(head,100,2);
        head=SinglyListNode.insertData(head, 10000,3);
        head=SinglyListNode.insertData(head, 0, 1);
        head = SinglyListNode.insertData(head, 20, 2);
        SinglyListNode.print(head);
        head = SinglyListNode.deleteByPosition(head, 5);
        SinglyListNode.print(head);
        


        //Doubly Linked List
        DoublyListNode dHead = new DoublyListNode(1);
        DoublyListNode dTail = new DoublyListNode(10);
        dHead.next = dTail;
        dTail.previous=dHead;
        DoublyListNode[] result = new DoublyListNode[2];
        result = DoublyListNode.insertData(dHead, dTail, 2, 2);
        dHead = result[0];
        dTail = result[1];
        result = DoublyListNode.insertData(dHead, dTail, 3, 1);
        dHead = result[0];
        dTail = result[1];
        DoublyListNode.print(dHead);
        DoublyListNode.printReverse(dTail);
        result = DoublyListNode.deleteByPosition(dHead, dTail, 0);
        dHead = result[0];
        dTail = result[1];
        DoublyListNode.print(dHead);
        result = DoublyListNode.deleteByPosition(dHead, dTail, 10);


        
    }
}
