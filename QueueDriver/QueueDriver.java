package QueueDriver;

import QueueDriver.Queue.Node;

public class QueueDriver {
	
	public static void main(String[] args) {
		
		Queue myQueue=new Queue(4);
		
		//enqueue
		myQueue.enqueue(6);
		myQueue.enqueue(8);
		
		//dequeue
		Node dequeu3=myQueue.dequeue();
		System.out.println("Dequeued element:::"+dequeu3.value);
		
		Node dequeu2=myQueue.dequeue();
		System.out.println("Dequeued element:::"+dequeu2.value);
		
		Node dequeu1=myQueue.dequeue();
		System.out.println("Dequeued element:::"+dequeu1.value);
		
		Node dequeu0=myQueue.dequeue();
		System.out.println("Dequeued element:::"+dequeu0);
		
		myQueue.printQueue();
		myQueue.getFirst();
		myQueue.getLast();
		myQueue.getLength();
		
	}

}
