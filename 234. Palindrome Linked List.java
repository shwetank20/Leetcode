/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        fast=reverseList(slow.next);
        slow=head;
        int x=0;
        while(slow!=null &&fast!=null  ){
            if(slow.val==fast.val){
            slow=slow.next;
            fast=fast.next;
            }
            else {
                x=1;
                break;
            }
            
        }
        if(x==1)
            return false;
            return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        ListNode nex;
        while(cur!=null){
            nex = cur.next;
            cur.next = prev;
            
            prev = cur;
            cur = nex;
            
        }
        head=prev;
        return head;
    }
}