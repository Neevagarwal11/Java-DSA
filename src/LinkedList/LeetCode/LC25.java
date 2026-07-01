package LinkedList.LeetCode;

public class LC25 {
    //reverse Nodes in K group
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode prev =null;
        ListNode current = head;

        if(k <=1 || head ==null){
            return head;
        }

        while(true){
            ListNode last = prev;
            ListNode newEnd = current;

            //check if i<k 
            ListNode check = current;
            int count=0;

            while(check != null && count<k){
                check = check.next;
                count++;
            }
            if(count<k){
                break;
            }

            //reverse the subsection
            ListNode next= current.next;

            for (int i = 0; current !=null && i<k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;
            if(current == null){
                break;
            }

            prev = newEnd;
        }

        return head;

    } 
}
