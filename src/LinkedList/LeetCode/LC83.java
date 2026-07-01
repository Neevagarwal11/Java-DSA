package LinkedList.LeetCode;

public class LC83 {
    public class ListNode {
    int val;
     public ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private ListNode tail;
    private ListNode head;

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode();

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        tail = node; 
        tail.next = null;

        return node;
    }


    




}