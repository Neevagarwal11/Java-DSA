package LinkedList.LeetCode;

public class LC141 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
    }
    }

    public boolean hasCycle(ListNode head) {        //Use Fast n slow pointer for any kind of cycle detection problem
        //Incase of fast and slow pointer the slow pointer iterates by 1 pos and fast pointer iterates in 2 pos for every loop, while running the loop if the pointers meet again meet in a same position that indicates that there is a cycle in the LL.

        ListNode fast= head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {        //Use Fast n slow pointer for any kind of cycle detection problem
        //Incase of fast and slow pointer the slow pointer iterates by 1 pos and fast pointer iterates in 2 pos for every loop, while running the loop if the pointers meet again meet in a same position that indicates that there is a cycle in the LL.

        ListNode fast= head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;
            }
        }
        return 0;
    }
    
}
 