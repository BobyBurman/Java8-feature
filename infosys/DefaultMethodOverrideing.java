package infosys;

interface Interf4{
	default void m() {
		System.out.println("Interf");
	}
}

public class DefaultMethodOverrideing implements Interf4 {
    
	public void m() {
		System.out.println("class");
	}
	
	public static void main(String[] args) {
		
		DefaultMethodOverrideing t=new DefaultMethodOverrideing();
		t.m();
		
	}
	
} 
