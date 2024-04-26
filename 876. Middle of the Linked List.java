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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode cur=head,cur1=head;
        while( cur1!=null &&cur1.next!=null){
            //cnt++;
            cur=cur.next;
            cur1=cur1.next.next;
        }
        
        return cur;
    }
}