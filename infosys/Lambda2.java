package infosys;

interface Interf{
	public void m1();
}

public class Lambda2 {
	
	public static void main(String[] args) {
		
		/*
		 * Interf i=new Interf() {
		 * 
		 * @Override public void m1() { 
		 * System.out.println("dfb"); } };
		 */
		 
		
		  Interf i=()->{ System.out.println("dfb"); };
		 
		  i.m1();		
	}

}
