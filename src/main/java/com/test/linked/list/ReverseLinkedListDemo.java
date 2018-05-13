package com.test.linked.list;

public class ReverseLinkedListDemo {

	public static void main(String args[]) {
		LinkedList<String> linkedlist = getDefaultList();
		//System.out.println("linked list before reversing : " + linkedlist);
		//linkedlist.reverseIteratively();
		System.out.println("linked list after reversing : " + linkedlist);
		linkedlist.reverseRecursively();
		System.out.println("linked list after reversing recursively: " + linkedlist);

	}

	private static LinkedList<String> getDefaultList() {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.insertLast("A");
		linkedlist.insertLast("B");
		linkedlist.insertLast("C");
		linkedlist.insertLast("D");
		linkedlist.insertLast("E");
		linkedlist.insertLast("F");
		return linkedlist;
	}


}
