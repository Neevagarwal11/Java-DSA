package StacksNQueue;

import java.util.Queue;


public class main {
    public static void main(String[] args) throws Exception {

        DynamicStack stack = new DynamicStack(5);   //The size of the stack could be changed 
        // CustomStack stack = new CustomStack(5);
        CustomStack stack2 = new DynamicStack();    //CustomStack refers what all access you get, DynamicStack determines what is the type of those access provided.

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        CustomQueue queue = new CustomQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        // queue.display();

        // queue.remove();
        // queue.display();

        // Circular Queue
        CircularQueue cirqueue = new CircularQueue();
        cirqueue.insert(1);
        cirqueue.insert(2);
        cirqueue.insert(3);
        cirqueue.insert(4);
        cirqueue.insert(5);

        cirqueue.display();
        cirqueue.remove();
        cirqueue.insert(133);
        cirqueue.display();

    }
}
