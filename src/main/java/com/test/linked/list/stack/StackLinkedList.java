package com.test.linked.list.stack;

import com.test.linked.list.LinkedList;
import com.test.linked.list.LinkedListEmptyException;

/**
 * For implementing stack using using LinkedList- This StackLinkedList
 * class internally maintains LinkedList reference in java.
 */
 
class StackLinkedList<T>{
    
    LinkedList<T> linkedList = new LinkedList<T>(); // creation of Linked List
    
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(T value){
           linkedList.insertFirst(value);
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public void pop() throws StackEmptyException {
           try{
           linkedList.deleteFirst();
           }catch(LinkedListEmptyException llee){
                  throw new StackEmptyException();
           }
    }
 
    /**
     * Display stack.
     */
    public void displayStack() {
           System.out.print("Displaying Stack >  Top to Bottom : ");
           linkedList.displayLinkedList();
    }
 
    
}
 