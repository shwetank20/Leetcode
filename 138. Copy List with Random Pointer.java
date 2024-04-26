/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null )
        return null;
        Node cur=head;
        Node cur2=new Node(0);
        Node cur3=new Node(0);
        int x=1,cnt=-1;
        HashMap<Node,Node> mpp=new HashMap<>();
        
        while(cur!=null){
            
            Node node=new Node(cur.val);
            if(x==1){
            cur2.next=node;
            x--;
            }
            //node.next=cur.next; // this copies the orignal ll next in new ll thus wrong
           // cnt++;
            mpp.put(cur,node);
           // mpp2.put(cur,cnt);
            cur=cur.next;
        }
        

       // cnt=-1;
        cur2=cur2.next;
        cur3=cur2;
        cur=head;
        while(cur!=null){
            Node t= mpp.get(cur);
            t.next=cur.next==null?null:mpp.get(cur.next);
            t.random=cur.random==null?null:mpp.get(cur.random);

           cur=cur.next;
           cur2=cur2.next;

        }
        return cur3;

    }
}