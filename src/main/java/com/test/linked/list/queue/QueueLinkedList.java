package com.test.linked.list.queue;

import com.test.linked.list.LinkedList;
import com.test.linked.list.LinkedListEmptyException;

class QueueLinkedList<T>{
    
    LinkedList<T> linkedList = new LinkedList<T>(); // creation of Linked List
    
    /**
     * Insert element at rear in Queue
     */
    public void insert(T value){
           linkedList.insertLast(value);
    }
 
    /**
     * Removes elements from front of Queue 
     */
    public void remove() throws QueueEmptyException {
           try{
           linkedList.deleteFirst();
           }catch(LinkedListEmptyException llee){
                  throw new QueueEmptyException();
           }
    }
 
    /**
     * Display queue.
     */
    public void displayStack() {
           System.out.print("Displaying Queue> Front to Rear: ");
           linkedList.displayLinkedList();
    }
 
    
}
 