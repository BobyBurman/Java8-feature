package infosys;

interface Interf1{
	
	default void m1(){
		System.out.println("Default");
	}
}

public class DefaultMethod implements Interf1{
	
	public static void main(String[] args) {
		
		DefaultMethod t=new DefaultMethod();
		
		t.m1();
		 
	}

}
