class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevHead = null;
        while(head!=null){
            ListNode nextRec = head.next;
            head.next = prevHead;
            prevHead = head;
            head = nextRec;
            //Reversing the connection b/w nodes
        }
        return prevHead;
    }
    //Description in copy
}
