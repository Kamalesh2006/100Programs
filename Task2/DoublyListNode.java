class DoublyListNode{

    DoublyListNode previous;
    int data;
    DoublyListNode next;
    /**
     * 
     * @param data to initialize the instance variable data
     */

    DoublyListNode(int data){
        previous =null;
        this.data=data;
        next =null;
    }

    /**
     * 
     * @param head pass the head of DoublyListNode
     * @param tail pass the tail of DoublyListNode
     * @param data pass the data to insert as node 
     * @param pos position at which the data node to be inserted
     * @return DoublyListNode[] of head & tail
     */

    public static DoublyListNode[] insertData(DoublyListNode head,DoublyListNode tail, int data, int pos){

        DoublyListNode iterate = head;
        pos--;
        DoublyListNode temp = new DoublyListNode(data);
        boolean traverOnce=false;
        //this condition is checked because user might try to insert before head

        while(pos>1){

            traverOnce=true;

            if(iterate.next==null){

                temp.previous = tail;
                tail.next=temp;
                tail = temp;
                return new DoublyListNode[]{head,tail};

            }

            iterate=iterate.next;
            pos--;

        }
        if(!traverOnce && pos==0){

            head.previous=temp;
            temp.next = head;
            head=temp;

        }
        else{

            temp.previous=iterate;
            temp.next = iterate.next;
            iterate.next.previous = temp;
            iterate.next=temp;

        }

        return new DoublyListNode[]{head,tail};
        
    }
    /**
     * 
     * @param head pass the head of DoublyListNode 
     * @param tail pass the tail of DoublyListNode
     * @param pos position of Node to delete
     * @exception LinkedListIndexOutOfBoundsException is thrown whenever the position is out of bounds
     * @return returns DoublyListNode[] of head & tail
     */
    public static DoublyListNode[] deleteByPosition(DoublyListNode head, DoublyListNode tail, int pos)throws LinkedListIndexOutOfBoundsException{

        //this is checked because user may try to delete head
        if(pos==1){
            head = head.next;
            head.previous =null;
            return new DoublyListNode[]{head,tail};
        }

        pos--;
        DoublyListNode iterate =head;

        //traversing before the position
        while(pos>1){

            if(iterate.next==tail && pos==2){

                iterate.next=null;
                tail =iterate;
                return new DoublyListNode[]{head,tail};

            }
            else if(iterate.next==null && pos>2){
                throw new LinkedListIndexOutOfBoundsException();
            }

            iterate=iterate.next;
            pos--;
        }

        iterate.next = iterate.next.next;
        iterate.next.previous = iterate;
        return new DoublyListNode[]{head,tail};

    }
    /***
     * @param head pass the head DoublyListNode reference to print the linkedlist
     * @return void
     */
    public static void print(DoublyListNode head){

        DoublyListNode iterate=head;
        while(iterate!=null){
            System.out.print(iterate.data+" ");
            iterate=iterate.next;
        }
        System.out.println();
    }

    /**
     * 
     * @param tail pass the tail of DoublyListNode reference to print from backwards
     * @return void 
     */
    public static void printReverse(DoublyListNode tail){
        DoublyListNode iterate = tail;
        while(iterate!=null){
            System.out.print(iterate.data+" ");
            iterate=iterate.previous;
        }
        System.out.println();
    }
}

