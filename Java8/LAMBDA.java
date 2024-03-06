package Java8;

interface Interf{
	public void m1(Integer i);
}
public class LAMBDA {
	
	public static void main(String[] args) {
		
		Interf I= i->{
			if(i>10) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		};
		
		I.m1(10);
	}

	}
