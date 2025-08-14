/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here.
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return len(fast,slow);
        }
        return 0;
    }
    
    public int len(Node fast, Node slow){
        int cnt=1;
        fast=fast.next;
        while(fast!=slow){
            fast=fast.next;
            cnt++;
        }
        return cnt;
    }
}