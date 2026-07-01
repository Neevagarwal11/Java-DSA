package LinkedList.LeetCode;

public class LC143 {
    // Reordered List       
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid= middleNode(head);
        
        ListNode hs = reverse(mid);
        ListNode hf = head;

        //rearrange

        while(hf != null && hs!= null){
            ListNode tempf = hf.next;
            ListNode temps = hs.next;

            hf.next = hs;
            hf= tempf;

            hs.next = hf;
            hs = temps;
        }

        //point tail to null
        if(hf != null){
            hf.next = null;
        }

    }

    private ListNode middleNode(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    private ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev= present;
            present = next;
            if(next !=null){
                next = next.next;
            }
        }
        return prev;
        
    }


}
