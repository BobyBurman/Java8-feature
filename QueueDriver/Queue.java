package QueueDriver;

public class Queue {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int lenght;

	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		lenght++;
	}

	// printing queue
	public void printQueue() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// enqueue
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (lenght == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		lenght++;
	}

	// dequeue
	public Node dequeue() {
		if (lenght == 0) {
			return null;
		}
		Node temp = first;
		if (lenght == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			temp.next = null;
		}
		lenght--;
		return temp;

	}

	public void getFirst() {
		if (first == null) {
			System.out.println("First: null");
		} else {
			System.out.println("First: " + first.value);
		}
	}

	public void getLast() {
		if (last == null) {
			System.out.println("Last: null");
		} else {
			System.out.println("Last: " + last.value);
		}
	}

	public void getLength() {
		System.out.println("Length: " + lenght);
	}

}
