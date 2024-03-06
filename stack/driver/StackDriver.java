package stack.driver;

public class StackDriver {
	public static void main(String[] args) {
		
		Stack myStack=new Stack(4);
		
		
		//push(prepend)
		myStack.push(12);
		
		//pop(remove from first)
		System.out.println("poped element:::"+myStack.pop().value);
		
		//printing stack
		myStack.printStack();
		
		//Printing top
		System.out.println("GET TOP:::"+myStack.getTop().value);
		
		//printing height
		System.out.println("GET HEIGHT:::"+myStack.getHeight());
	}

}
