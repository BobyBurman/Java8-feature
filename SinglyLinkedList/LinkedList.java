package SinglyLinkedList;

public class LinkedList {
	
	//creating node Inner class
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	private Node head;
	private Node tail;
	private int lenght;
	
	
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		lenght = 1;
	}
	
	
	//printing list
	public void printlist() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	//append 
	public void append(int value) {
		Node newNode=new Node(value);
		if(lenght==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		lenght++;
		
	}
	
	
	//remove last node
	public Node removeLast() {
		
		if(lenght==0) {
			return null;
		}
		Node temp=head;
		Node pre=head;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		
		tail=pre;
		tail.next=null;
		
		if(lenght==1) {
			head=null;
			tail=null;
		}
		lenght--;
		return temp;
	}
	
	//prepend
	public void prepend(int value) {
		Node newNode=new Node(value);
		if(lenght==0) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		lenght++;
	}
	//remove first element
	public Node removeFirst() {
		if(lenght==0) {
			return null;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		lenght--;
		if(lenght==0) {
			tail=null;
		}
		return temp;
	}
	
	//get a node
	public Node getIndex(int index) {
		
		if(index<0 || index>=lenght) {
			return null;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
		
	}
	
	//set a node
	public boolean setIndex(int index, int value) {
		
		Node temp=getIndex(index);
		if(temp!=null) {
			temp.value=value;
			return true;
		}
		return false;
		
	}
	
	//Insert a node
	public boolean insert(int index,int value) {
		
		if(index<0 || index>lenght) {
			return false;
		}
		if(index==0) {
			prepend(value);
			return true;
		}
		if(index==lenght) {
			append(value);
			return true;
		}
		
		Node newNode=new Node(value);
		Node temp=getIndex(index-1);
		newNode.next=temp.next;
		temp.next=newNode;
		lenght++;
		return true;
		
	}
	
	//remove node
	public Node remove(int index) {
		if(index<0 ||index>=lenght) return null;
		if(index==0) return removeFirst();
		if(index==lenght-1) return removeLast();
		
		Node prev=getIndex(index-1);
		Node temp=prev.next;
		
		prev.next=temp.next;
		temp.next=null;
		lenght--;
		return temp;
	}
	
	//reverse 
	public boolean reverseLinkedList() {
		
		Node temp=head;
		head=tail;
		tail=temp;
		Node before=null;
		Node after=temp.next;
		for(int i=0;i<lenght;i++) {
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
		return true;
	}
	
	
	
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	public void getHeadnext() {
		System.out.println("Head next: "+head.next);
	}
	public void getTail() {
		System.out.println("tail: "+tail.value);
	}
	public void getTailnext() {
		System.out.println("tail next: "+tail.next);
	}
	public void getLenght() {
		System.out.println("Length: "+lenght);
	}

}
