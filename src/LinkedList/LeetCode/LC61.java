package LinkedList.LeetCode;

public class LC61 {
    //Rotate the Linked List
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next==null || k <=0 ){
            return head;
        }
        ListNode last = head;
        int length =1;
        while(last.next !=null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k%length;
        int skip = length - rotations; // This keeps the pointer in the position before the start of the sublist

        ListNode newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        
        return head;   
    }   
}
