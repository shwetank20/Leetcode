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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode a=l1,b=l2;
        ListNode c=new ListNode(1);
        c.next=null;
       int carry=0;
       while(a!=null && b!=null){
           int temp=a.val+b.val+carry;
               carry=temp/10;
               temp=temp%10;
           
           a.val=temp;
           b.val=a.val;
           if(a.next==null && b.next==null && carry==1){
               a.next=c;
               return l1;
           } 
           a=a.next;
           b=b.next;

        }
        if(a==null){
            while(b!=null){
            int temp=carry+b.val;
            carry=temp/10;
            temp=temp%10;
           
           b.val=temp;
           if(b.next==null && carry==1){
           b.next=c;
           break;
            }
           b=b.next;
            }
            

            return l2;

        }
        else  {
            while(a!=null){
            int temp=carry+a.val;    
            carry=temp/10;
            temp=temp%10;
           a.val=temp;
           if(a.next==null && carry==1){
           a.next=c;
           break;
           }
           a=a.next;
            }
            
            return l1;
        }
       //return l1;
    }
}