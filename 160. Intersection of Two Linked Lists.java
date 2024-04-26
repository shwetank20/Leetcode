/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA,cur2=headB;
        int cnt1=0,cnt2=0,dif=0;
        while(cur1!=null){
            cnt1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            cnt2++;
            cur2=cur2.next;
        }
        cur2=headB;
        cur1=headA;
        if(cnt1<cnt2){
        dif=cnt2-cnt1;
        
        while(dif!=0){
            cur2=cur2.next;
            dif--;
        }
        }
        
        else{
        dif=cnt1-cnt2;
        while(dif!=0){
            cur1=cur1.next;
            dif--;
        }
        }

        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;

        }
        return cur1;

        

    }
}
//sol 2
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA,cur2=headB;
        while(cur1!=cur2){
        cur1=(cur1==null)?headB:cur1.next;
        cur2=(cur2==null)?headA:cur2.next;
        }
        return cur1;

        

       
        // if no intersction then cur1=null therefor no problem we return null
        

        

    }
}