/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur=head,cur1=head;
        
        if(cur==null)
        return false;
        while(cur1.next!=null && cur1.next.next!=null){
           
            cur=cur.next;
            cur1=cur1.next.next;
            if(cur==cur1)
            return true;
        }
        return false;
    }
}