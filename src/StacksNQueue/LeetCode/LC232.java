package StacksNQueue.LeetCode;

import java.util.Stack;

// Implement Queue using Stacks

public class LC232 {

    public static void main(String[] args) {
        
    }
   
}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peek;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}


// 
class QueueUsingStackRemove{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
         while(!first.isEmpty()){
            second.push(first.pop());
         }

         first.push(item);

         while(!second.isEmpty()){
            first.push(second.pop()); 
         }

    }

    public int remove() throws Exception{
        return first.pop();
    }

    public int peek() throws Exception{
       return first.peek();
        
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}