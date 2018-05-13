package com.test.linked.list.circular;
public class LinkedListCircularCalculateNodes {
 
    public static void main(String[] args) {
           
           LinkedList<Integer> linkedList=new LinkedList<Integer>();
           linkedList.inserthead(66);
           linkedList.inserthead(55);
           linkedList.inserthead(44);
           linkedList.inserthead(33);
           linkedList.inserthead(22);
           linkedList.inserthead(11);
           
           linkedList.makeLinkedListCircular();
           linkedList.displayLinkedList();
           
           linkedList.calculateNodesInCircularLikedList();
    }
 
}