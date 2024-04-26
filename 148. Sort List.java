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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode slow=head,fast=head,temp=null;

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
       // System.out.println(head.val+" "+temp.val);
        temp.next=null;
        ListNode ls=sortList(head);
        ListNode rs=sortList(slow);
        return merge(ls,rs);
    }
    public ListNode merge(ListNode ls,ListNode rs){
        ListNode sor=new ListNode(0);
        ListNode cur=sor;
        while(ls!=null && rs!=null){
            if(ls.val<rs.val){
                cur.next=ls;
                ls=ls.next;

            }
            else {
                cur.next=rs;
                rs=rs.next;
            }
            cur=cur.next;
        }
        if(ls!=null){
            cur.next=ls;
           // ls=ls.next;

        }
        if(rs!=null){
            cur.next=rs;
           // rs=rs.next;
        }
        return sor.next;
    }
}