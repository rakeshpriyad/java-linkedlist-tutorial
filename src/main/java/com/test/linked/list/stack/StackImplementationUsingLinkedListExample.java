package com.test.linked.list.stack;

public class StackImplementationUsingLinkedListExample {
	public static void main(String[] args) {

		StackLinkedList<Integer> stackLinkedList = new StackLinkedList<Integer>();
		System.out.println("INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST ");
		stackLinkedList.push(39); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.push(71); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.push(11); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.push(76); // push node.
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java

		System.out.println("\nDELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST ");

		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
		stackLinkedList.pop(); // pop Node
		stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java

	}
}
