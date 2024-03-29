class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head,slow=head;
        
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        //fast will become null only when n==size of linked list.
        //First node will be removed
        if(fast==null){
            return head.next;
        }

        //Move fast to the end, maintaining the gap
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        //Skipping the nth node from last.
        slow.next = slow.next.next;
        return head;
    }
}
