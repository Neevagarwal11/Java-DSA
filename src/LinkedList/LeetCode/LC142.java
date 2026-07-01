package LinkedList.LeetCode;


// Linked List Cycle II find the start point of cycle

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class LC142 {
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


    // To get the start of the cycle take 2 pointers and find the lenght of the cycle and then move 1 pointer the length of cycle times and then start moving the second pointer simultaneously then both the pointers will meet at the start of the cycle.

    public ListNode detectCycle(ListNode head) {
        int length =0;

        ListNode fast = head;
        ListNode slow = head;
        if(length ==0){
            return null;
        }

        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                length = lengthCycle(slow);
                break;
            }
        }


        // Find the start Node
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s= s.next;
            length--;
        }

        while(f!=s){
            f=f.next;
            s = s.next;  
        }
        return s;
    }
}
