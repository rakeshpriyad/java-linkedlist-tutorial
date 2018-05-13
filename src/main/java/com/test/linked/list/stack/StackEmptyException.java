package com.test.linked.list.stack;
/**
 *Exception to indicate that Stack is empty.
 */
public class StackEmptyException extends RuntimeException {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 7815378828458281391L;

	public StackEmptyException(){
        super();
    }
    
    public StackEmptyException(String message){
        super(message);
    }
    
}
 