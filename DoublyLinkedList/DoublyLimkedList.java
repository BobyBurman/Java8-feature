package DoublyLinkedList;

public class DoublyLimkedList {

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int length;

	public DoublyLimkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// append
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	// remove last
	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

	// prepend
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		length++;
	}

	// remove first
	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}
	
	//get a node at particular index
	public Node getIndex(int index) {
		if(index<0||index>=length) {
			return null;
		}
		Node temp=head;
		
		if(index<length/2) {
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
		}else {
			temp=tail;
			for(int i=length-1;i>index;i--) {
				temp=temp.prev;
			}
		}
		return temp; 
	}
	
	//set a value at particular index
	public boolean set(int index, int value) {
		Node temp=getIndex(index);
		if(temp!=null) {
			temp.value=value;
			return true;
		}
		return false;
	}
	
	//insert a node
	public boolean insert(int index,int value) {
		if(index<0 ||index>length) {
			return false;
		}
		if(index==0) {
			prepend(value);
			return true;
		}
		if(length==index) {
			append(value);
			return true;
		}
		Node newNode=new Node(value);
		Node before=getIndex(index-1);
		Node after=before.next;
		
		newNode.prev=before;
		newNode.next=after;
		before.next=newNode;
		after.prev= newNode;
		length++;
		return true;
	}
	
	//remove a node from a particular index
	public Node remove(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		if(index==0) {
			return removeFirst();
		}
		if(index==length-1) {
			return removeLast();
		}
		Node temp=getIndex(index);
		Node before=temp.prev;
		Node after=temp.next;
		before.next=after;
		after.prev=before;
		temp.next=null;
		temp.prev=null;
		length--;
		return temp;
	}

	// PrintDoublyLinkList
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("head:::" + head.value);
	}

	public void getTail() {
		System.out.println("tail:::" + tail.value);
	}

	public void getLength() {
		System.out.println("length:::" + length);
	}

}
