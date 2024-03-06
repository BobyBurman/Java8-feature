package TestCode;

import java.util.Scanner;

class A extends RuntimeException{
	
	A(String msg){
		super(msg);
	}
	
	
}
class B extends RuntimeException{
	
	B(String msg){
		super(msg);
	}
	
	
}

public class CustomizedException {
	
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
	
		if(n>60) {
			throw new B("Too Old Exception 'B'");
		}else if(n<18) {
			throw new A("Too Young Exception 'A'");
		}else {
			System.out.println("The age is::: "+n);
		}
		
		
	}

}
