package com.test.linked.list;

import com.test.node.Node;

public class LinkedList<T> {

	Node<T> head;

	public LinkedList() {
		this.head = null;
	}

	@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while(current != null){
           sb.append(current).append("-->");
           current = current.getNext();
        }    
        if(sb.length() >=3){
            sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
        }
     
        return sb.toString();
    }
	
	/**
	 * Inserts new Node at last of LinkedList.
	 */
	public void insertLast(T data) {
		Node<T> newNode = new Node<T>(data); // Creation of New Node.

		if (head == null) { // means LinkedList is empty, make first point to new Node.
			head = newNode; // first ---> newNode
			return;
		}

		Node<T> current = head; // save reference to first Node in tempNode- so that we could return saved
								// reference.
		while (current.getNext() != null) { // Executes until we don't find last Node of LinkedList.
										// If getNext() of some Node is pointing to null, that means it's a last Node.
			current = current.getNext(); // move to getNext() Node.
		}
		current.setNext(newNode); // make last's Node getNext() point to new Node
	}

	/**
     * Insert New Node at first position
     */
    public void insertFirst(T data) {
           Node<T> newNode = new Node<T>(data); //Creation of New Node.
           newNode.setNext(head);   //newLink ---> old first
           head = newNode;  //first ---> newNode
    }
    
	/**
	 * Deletes first Node
	 */
	public Node<T> deleteFirst() {
		if (head == null) { // means LinkedList in empty, throw exception.
			throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
		}
		Node<T> tempNode = head; // save reference to first Node in tempNode- so that we could return saved
								// reference.
		head = head.getNext(); // delete first Node (make first point to second node)
		tempNode.setNext(null);
		return tempNode; // return tempNode (i.e. deleted Node)
	}

	/**
	 * Display LinkedList
	 */
	public void displayLinkedList() {
		Node<T> tempDisplay = head; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of list.
			tempDisplay.displayNode();
			tempDisplay = tempDisplay.getNext(); // move to getNext() Node
		}
		System.out.println();

	}

	private Node<T> reverseRecursively(Node<T> node){
	       Node<T> newHead;
	     
	       //base case - tail of original linked list
	       if((node.getNext() == null)){
	           return node;
	       }
	       newHead = reverseRecursively(node.getNext());
	     
	       //reverse the link e.g. C->D->null will be null       
	       node.getNext().setNext(node);
	       node.setNext(null);    
	       return newHead;
	    }
	
	public void reverseRecursively(){
        head = reverseRecursively(head);
    }  
	  
	
	public void reverseIteratively() {
        Node<T> current = head;
        Node<T> previous = null;
        Node<T> forward = null;
     
        // traversing linked list until there is no more element
        while(current.getNext() != null){
         
            // Saving reference of next node, since we are changing current node
            forward = current.getNext();
         
            // Inserting node at start of new list
            current.setNext(previous);
            previous = current;
         
            // Advancing to next node
            current = forward;
        }
     
        head = current;
        head.setNext(previous);
    }
}
