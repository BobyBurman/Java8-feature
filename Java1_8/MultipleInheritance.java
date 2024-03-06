package Java1_8;

/*class A{
	A(){
		
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
}
class B{
	B(){
		
	}
	
	public void m1() {
		System.out.println("m1");
	}
	
}*/

interface A{	
	default void m1() {
		System.out.println("Printing A interface");
	}
}

interface B{
	default void m2() {
		System.out.println("Printing B interface");
	}
}
class C implements A,B{
	void m3() {
		m1();
		m2();
		System.out.println("Printing Class C");
	}
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
			
		C obj=new C();
		obj.m3();
		
	}
}
