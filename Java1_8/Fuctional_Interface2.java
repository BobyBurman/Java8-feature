package Java1_8;

interface inter2{
	void m1(int a);
	void m2(int b);
}


public class Fuctional_Interface2{
	
	public static void main(String[] args) {
		
		inter2 in=new inter2() {
			
			@Override
			public void m1(int a) {
				System.out.println("printing value of 'a'::::"+ a);
			}

			@Override
			public void m2(int b) {
				System.out.println("printing value of 'b'::::"+ b);
				
			}
		};
		
		in.m1(12);
		
	} 

}
