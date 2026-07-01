package LinkedList.LeetCode;

public class LC234 {

    //List Palindrome Check

    public ListNode head;
    public ListNode tail;


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

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);
        ListNode rereverseHead = headSecond;

        //Compare both halves
        while(head != null && headSecond !=null){
            if(head.val != headSecond.val){
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }

        reverse(rereverseHead);

        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }
}