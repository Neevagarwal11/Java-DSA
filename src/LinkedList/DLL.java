package LinkedList;

public class DLL {
    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void displayReverse() {
        Node last = null;
        Node node = head;

        while (node != null) {
            last = node;
            node = node.next;
        }

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfterValue(int val, int after) {
        Node p = find(after);

        if(p == null){
            System.out.println("Does not exist");
        }

        Node node = new Node(val);
        node.next= p.next;
        p.next = node;
        node.prev = p;

        if(node.next != null){
            node.next.prev = node;
        }


    }

}
