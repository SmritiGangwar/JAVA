public class LinkedList {
    private class Node{
        int val;
        Node next;
    }
    private Node head;  //address of first node
    private Node tail;  //address of last node
    private int size;

    public void addFirst(int item){     //O(1)
        Node nn = new Node();
        nn.val = item;

        if(this.size==0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int item){  //O(1)
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addAtIndex(int item,int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("k out of Range");
        }
        if(k==0){
            addFirst(item);
        }
        else if(k==size){
            addLast(item);
        }
        else{
            Node k_1th = GetItem(k-1);
            Node nn = new Node();
            nn.val = item;
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }

    public void Display(){      //O(N)
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println("NULL");    //End of Linked List
    }


    private Node GetItem(int k) throws Exception{       //O(N)
        if(k<0 || k>=size){
            throw new Exception("k out of Range");
        }
        Node temp = head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }


    public  int getFirst(){
        return head.val;
    }

    public  int getLast(){
        return tail.val;
    }


    public  int getAtIndex(int k) throws Exception {
        return GetItem(k).val;
    }

    public int removeFirst(){   //O(1)
        Node temp = head;
        if(size==1){
            head = null;
            tail = null;
            size--;
        }
        else{
            head =head.next;
            temp.next=null;
            size--;
        }
        return temp.val;

    }

    public int removeLast() throws Exception {
        if(size==1){
            return removeFirst();
        }
        else{
            Node ss = GetItem(size-2);
            int rv = tail.val;
            tail=ss;
            tail.next = null;
            size--;
            return rv;
        }
    }

    public int removeAtIndex(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else {
            Node prev = GetItem(k-1);
            Node curr = prev.next;

            prev.next = curr.next;
            curr.next = null;
            return curr.val;
        }
    }

}
