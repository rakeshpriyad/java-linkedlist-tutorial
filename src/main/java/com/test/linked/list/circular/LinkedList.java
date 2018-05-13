package com.test.linked.list.circular;

import com.test.node.Node;

public class LinkedList<T> {

	Node<T> head;
	Node<T> circularPoint1; // points used to make LinkedList circular.
	Node<T> circularPoint2;

	Node<T> slowPointer; // will step over LinkedList by 1 Node.
	Node<T> fastPointer; // will step over LinkedList by 2 Node.

	public LinkedList() {
		this.head = null;
	}

	/**
	 * Inserts new Node at last of LinkedList.
	 */
	public void insertLast(T data) {
		Node<T> newNode = new Node<T>(data); // Creation of New Node.

		if (head == null) { // means LinkedList is empty, make head point to new Node.
			head = newNode; // head ---> newNode
			return;
		}

		Node<T> current = head; // save reference to head Node in tempNode- so that we could return saved
								// reference.
		while (current.getNext() != null) { // Executes until we don't find last Node of LinkedList.
										// If getgetNext()() of some Node is pointing to null, that means it's a last Node.
			current = current.getNext(); // move to getgetNext()() Node.
		}
		current.setNext(newNode); // make last's Node getgetNext()() point to new Node
	}

	/**
	 * Insert New Node at head position
	 */
	public void inserthead(T data) {
		Node<T> newNode = new Node<T>(data); // Creation of New Node.
		newNode.setNext(head); // newLink ---> old head
		head = newNode; // head ---> newNode

		/*
		 * Below we have kept track of two Nodes so that later we can make LinkedList
		 * circular(If required). Note:- I have kept track of below two nodes just for
		 * demonstration purpose. You may provide some other implementation for making
		 * LinkedList circular.
		 */
		if ((Integer) data == 33) {
			circularPoint1 = newNode;
		}
		if ((Integer) data == 66) {
			circularPoint2 = newNode;
		}
	}

	/**
     *This method makes LikedList circular- by making end Node point to some middle Node of LinkedList.
     *end Node--->middle Node.
     */
    public void makeLinkedListCircular(){
           circularPoint2.setNext(circularPoint1);
           System.out.println("LinkedList has been succesfully converted into CircularLinkedList");
    }
    
	/**
	 * Deletes head Node
	 */
	public Node<T> deletehead() {
		if (head == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node<T> tempNode = head; // save reference to head Node in tempNode- so that we could return saved
									// reference.
		head = head.getNext(); // delete head Node (make head point to second node)
		tempNode.setNext(null);
		return tempNode; // return tempNode (i.e. deleted Node)
	}

	/**
	 * Display LinkedList
	 */
	public void displayLinkedList() {
		Node<T> tempDisplay = head; // start at the beginning of linkedList
		int displayLimiterCtr=0;   //as our LinkedList is circular it will keep on displaying nodes till infinity...
		System.out.print("Displaying LinkedList [head--->last]: ");

		while (tempDisplay != null) { // Executes until we don't find end of list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.getNext(); // move to getNext() Node
	         if(++displayLimiterCtr >= 12)         //stops displaying after 12 Nodes.
                 break;
  
		}
		System.out.println();
		
	}
	
	
	public void calculateNodesInCircularLikedList(){
        slowPointer=head;
        fastPointer=head;
        
        while( (slowPointer!=fastPointer || slowPointer==head) //when head time condition is checked    slowPointer is equal to fastPointer -so that does not means LinkedList is circular and we exit while loop
                                                                                   //we got to be cautious by keeping extra check that whether we are on head node or not.
                     && fastPointer.getNext()!=null  //used to avoid NullPointerException(in case we are are on last Node- than setgetNext()() is null, calling further setgetNext()() on null will cause NPE.)
                     && fastPointer.getNext().getNext()!=null){
               slowPointer=slowPointer.getNext();         // step over LinkedList by 1 Node.
               fastPointer=fastPointer.getNext().getNext(); // step over LinkedList by 2 Node.    
        }
        
        //we will exit above while loop when we have detected LinkedList is circular.
        
        int noOfNodes=0;  //initially keep number of nodes to zero.    
        
        /*make one of the pointer point to head,
         * & than make both pointers step over LinkedList by 1 Node, they will meet at intersection point giving number of elements before loop formation.
         */
        slowPointer=head;  
        while(slowPointer!=fastPointer){
               slowPointer=slowPointer.getNext();  // step over LinkedList by 1 Node.
               fastPointer=fastPointer.getNext();  // step over LinkedList by 1 Node.
               noOfNodes++;
        }
        System.out.println("LinkedList is circular at Node: "+slowPointer.getData());
        
        /*
         *Make  slow pointer step over LinkedList by 1 Node.
         *& Make  slow pointer step over LinkedList by 2 Node.
         *They both will meet after certain number of iterations giving length of loop.
         */
        boolean pointersJustmet=true;
        while(slowPointer!=fastPointer || pointersJustmet){ //initially slowPointer is equal to fastPointer so boolean variable ensures that we don't exit in head iteration.
               slowPointer=slowPointer.getNext();  // step over LinkedList by 1 Node.
               fastPointer=fastPointer.getNext().getNext(); // step over LinkedList by 2 Node.
               noOfNodes++;
               pointersJustmet=false;
        }
        System.out.println("Total number of nodes in LinkedList are: "+noOfNodes);
 }
 

	 /**
     * method finds out intersection point of circular LikedList.
     */
    public void findIntersectionPointOfCircularLikedList(){
           slowPointer=head;
           fastPointer=head;
           
           while( (slowPointer!=fastPointer || slowPointer==head) //when head time condition is checked    slowPointer is equal to fastPointer -so that does not means LinkedList is circular and we exit while loop
                                                                                      //we got to be cautious by keeping extra check that whether we are on head node or not.
                        && fastPointer.getNext()!=null  //used to avoid NullPointerException(in case we are are on last Node- than getNext() is null, calling further getNext() on null will cause NPE.)
                        && fastPointer.getNext().getNext()!=null){
                  slowPointer=slowPointer.getNext();         // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.getNext().getNext(); // step over LinkedList by 2 Node.    
           }
           
           //we will exit above while loop when we have detected LinkedList is circular
           
           
           /*make one of the pointer point to head, and let other pointer continue to point to same node.
            * Than make both pointers step over LinkedList by 1 Node, they will meet at intersection point.
            */
           slowPointer=head;  
           while(slowPointer!=fastPointer){
                  slowPointer=slowPointer.getNext();  // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.getNext();  // step over LinkedList by 1 Node.
           }
           System.out.println("LinkedList is circular at Node: "+slowPointer.getData());
           
    }
    
    
    /**
     * method finds out whether LinkedList is circular or not?
     */
    public void findCircularOrNot(){
           slowPointer=head;
           fastPointer=head;
           
           while( (slowPointer!=fastPointer || slowPointer==head) //when head time condition is checked    slowPointer is equal to fastPointer -so that does not means LinkedList is circular and we exit while loop
                                                                                      //we got to be cautious by keeping extra check that whether we are on head node or not.
                        && fastPointer.getNext()!=null  //used to avoid NullPointerException(in case we are are on last Node- than getNext() is null, calling further getNext() on null will cause NPE.)
                        && fastPointer.getNext().getNext()!=null){
                  slowPointer=slowPointer.getNext();         // step over LinkedList by 1 Node.
                  fastPointer=fastPointer.getNext().getNext(); // step over LinkedList by 2 Node.    
           }
           
           if(slowPointer==fastPointer)
                  System.out.println("LinkedList is CIRCULAR");
           else
                  System.out.println("LinkedList is NOT CIRCULAR");
           
    }

}
