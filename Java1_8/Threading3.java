package Java1_8;

/*class MyThread3 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<9;i++) {
			System.out.println("Welcome!");
		}
		
	}
	
}*/

public class Threading3 { 
	
	public static void main(String[] args) {
	
		Thread t=new Thread(
				()->{
					for(int i=0;i<9;i++) {
						System.out.println("Welcome!");
					}
				}
				);
		t.start();
		
		for(int j=0;j<9;j++) {
			System.out.println("Hello!");
		}
		
		
	}

}
