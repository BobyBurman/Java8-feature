package SinglyLinkedList;

import SinglyLinkedList.LinkedList.Node;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Let's do data structure");
		LinkedList myLinkedList=new LinkedList(1);
		
		//append
		myLinkedList.append(2);
		myLinkedList.append(4);
		
		//remove last node
		Node a=myLinkedList.removeLast();
		System.out.println("removed element :::"+a.value);
		
		//prepend
		myLinkedList.prepend(9);
		
		//remove first element
		Node r=myLinkedList.removeFirst();
		System.out.println("removed first element :::"+r.value);
		
		//get a node
		Node index=myLinkedList.getIndex(1);
		System.out.println("getIndex element :::"+index.value);
		
		//set a value of a node 
		boolean flag=myLinkedList.setIndex(1,12);
		System.out.println("setIndex flag :::"+flag);
		
		//insert a node
		System.out.println("Inserted node:::"+myLinkedList.insert(1,32));
		
		//remove
		System.out.println("Removed node:::"+myLinkedList.remove(2).value);
		
		//reverse
		System.out.println("Reverse linkedList:::"+myLinkedList.reverseLinkedList());
		
		//printing
		myLinkedList.printlist();
		
		
		
		myLinkedList.getHead();
		myLinkedList.getHeadnext();
		myLinkedList.getTail();
		myLinkedList.getTailnext();
		myLinkedList.getLenght();
	}

}
