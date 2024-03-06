package Java1_8;

interface Interf {
	
	 void m1(int a);
	
}

class Test implements Interf{
	
	public void m1(int a) {
		System.out.println("Printing value of 'a':::"+a);
	}
}

public class Fuctional_Interface1 {
	
	public static void main(String[] args) {
		
		Interf obj=new Test();
		obj.m1(12); 
		
	}

}
