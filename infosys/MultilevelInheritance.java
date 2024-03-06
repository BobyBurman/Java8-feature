package infosys;

interface i1 {
	default void m1() {
		System.out.println("i1");
	}
}

interface i2 {
	default void m2() {
		System.out.println("i2");
	}
}

public class MultilevelInheritance implements i1,i2{

	@Override
	public void m1() { 
		// TODO Auto-generated method stub
		i1.super.m1();
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		i2.super.m2();
	}
	public static void main(String[] args) {
		
		
		MultilevelInheritance t=new MultilevelInheritance();
		
		t.m1();
		t.m2();
	}
	
}
