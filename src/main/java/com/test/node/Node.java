package com.test.node;

public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		super();
		this.data = data;
	}

	/**
	 * Display Node's data
	 */
	public void displayNode() {
		System.out.print(data + " ");
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return   "-->"+data;
	}
	
	
}
