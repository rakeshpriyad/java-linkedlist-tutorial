package com.test.linked.list.queue;
public class QueueImplementationUsingLinkedListExample {
    public static void main(String[] args) {
           
           QueueLinkedList<Integer> queueLinkedList=new QueueLinkedList<Integer>();
           
           System.out.println("INSERTING AT LAST (REAR) IN QUEUE IMPLEMENTED USING LINKED LIST ");
           queueLinkedList.insert(11); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(71); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(39); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(31); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
 
           System.out.println("\nDELETING FROM FIRST (FRONT) OF QUEUE IMPLEMENTED USING LINKED LIST ");
 
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           
 
    }
}
 