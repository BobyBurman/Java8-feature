package DoublyLinkedList;

import DoublyLinkedList.DoublyLimkedList.Node;

public class Main {
	public static void main(String[] args) {
		
		DoublyLimkedList mylinkedList=new DoublyLimkedList(1);
		//append
		mylinkedList.append(2);
		mylinkedList.append(3);
		mylinkedList.append(4);
		mylinkedList.append(5);
		mylinkedList.append(6);
		
		//remove last
		Node last=mylinkedList.removeLast();
		System.out.println("Removed last node:::"+last.value);
		
		//prepend
		mylinkedList.prepend(12);
		
		//removeFirst
		Node removefirst=mylinkedList.removeFirst();
		System.out.println("removed first:::"+removefirst.value);
		
		//get index of a node
		Node ind=mylinkedList.getIndex(4);
		System.out.println("Node as per indexing:::"+ind.value);
		
		//set a value at particular index 
		boolean flag=mylinkedList.set(4, 33);
		System.out.println("set a value at particular index:::"+flag);
		
		//Insert a node 
		System.out.println("Inserted node:::"+mylinkedList.insert(2,100));
		
		//Remove a node
		Node remov=mylinkedList.remove(2);
		System.out.println("removed node::: "+remov.value);
		
		//printing doublylinked list
		mylinkedList.printList();
		mylinkedList.getHead();
		mylinkedList.getTail();
		mylinkedList.getLength();
	}
}
