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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur=new ListNode(),node,node2;
        cur.next=head;
        if(head==null || head.next==null){
            return head;
        }
        
        int cnt=0,x=0;
        while(cur.next!=null){
            cnt++;
            cur=cur.next;

        }
        //System.out.println(cnt);
        k=k%cnt;
        if(k==0)
        return head;
       
        x=cnt-k;
        cur=head;
        while(x!=1){
            x--;
            cur=cur.next;
        }
       // System.out.println(cur.val);
        node=cur.next;
        node2=cur;

        while(cur.next!=null)
        cur=cur.next;
        cur.next=head;
        node2.next=null;
        head=node;
        //System.out.println(cur.val);
        return head;

        
    }
}