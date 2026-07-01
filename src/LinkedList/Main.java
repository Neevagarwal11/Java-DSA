package LinkedList;

public class Main {

    public static void main(String[] args) {
        // LL list = new LL();
        // System.out.println("Insert First function:");
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(1);
        // list.insertFirst(23);
        // list.display();

        // System.out.println("Insert Last functions");
        // list.insertLast(99);
        // list.display();


        // // list.insert(100, 3);
        // // list.display();

        // // list.deleteFirst();
        // // list.display();

        // System.out.println("Delete Last function");
        // list.deleteLast();
        // list.display();

        // list.deleteIndex(2);
        // list.display();



        // --------------->Doubly Linked List
        // DLL list = new DLL();
        // System.out.println("Doubly Linked List Insert First");
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);

        // list.display();
        // System.out.println("Print in reverse");
        // list.displayReverse();

        // System.out.println("Insert Last function");
        // list.insertLast(99);
        // list.display();

        // System.out.println("Insert After Value");
        // list.insertAfterValue(2, 3);
        // list.display();



        // ------------------------>Circular Linked List
        CLL Clist = new CLL();
        Clist.insertVal(1);
        Clist.insertVal(2);
        Clist.insertVal(3);
        Clist.insertVal(4);
        Clist.Display();




        // ------------------------>Bubble Sort 
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(23);
        list.insertFirst(4);
        System.out.println("Unsorted List:");
        list.display();

        System.out.println("Bubble Sorted List");
        list.bubbleSort();
        list.display();


    }
    
    
}
