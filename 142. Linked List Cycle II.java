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
    public ListNode detectCycle(ListNode head) {
        ListNode first=head,second=head,third=head;
        if(head ==null )
        return null;
        
        while(second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second)
            break;

            
        }
        if(second.next==null || second.next.next==null)
        return null;
        while(first!=third){
            first=first.next;
            third=third.next;

        }
        return third;

        
        

    }
}