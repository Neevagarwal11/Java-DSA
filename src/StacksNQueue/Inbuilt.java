package StacksNQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inbuilt {
    public static void main(String[] args) {

        // ------------>Stack
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(32);
        // stack.push(41);
        // stack.push(45);
        // stack.push(46);

        // System.out.println(stack.pop());


        // ------------->Oueue
        Queue<Integer> queue = new LinkedList<>();      //Queue is an interface in JAVA and not as a class
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());


        // ------------>Deque: This is doubly ended queue 

        Deque<Integer> deque = new ArrayDeque<>();  //ArrayDeque helps in implementing deque as it's a resizable array
        deque.add(34);
        deque.add(35);
        deque.addFirst(1);
        deque.addLast(99);

        System.out.println(deque.peekLast());
        System.out.println(deque.peekFirst());
        deque.addLast(99);




    }
}
