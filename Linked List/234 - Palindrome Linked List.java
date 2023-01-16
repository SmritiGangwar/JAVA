class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head, prev,temp;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next=null;

        //Reversing the LL after mid
        while(slow!=null){
            temp = slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        fast = head;    //Starting node
        slow = prev;    //Last node

        while(fast.next != null){   //Mid node does not point to any node
            if(slow.val != fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}
