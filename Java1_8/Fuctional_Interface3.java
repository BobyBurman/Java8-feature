package Java1_8;

@FunctionalInterface
interface inter32{
	void m1(int a);
	
}

//lambda
public class Fuctional_Interface3{
	
	public static void main(String[] args) {
		
		inter32 in=a->{
					System.out.println("printing a::"+ a);
				};
		
		in.m1(12);
		
		}

}
