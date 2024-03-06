package Java1_8;

class MyThread1 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<9;i++) {
			System.out.println("Welcome!");
		}
		
	}
	
}

public class Threading2 {
	
	public static void main(String[] args) {
	
		
		Thread t=new MyThread1();
		t.start();
		
		for(int j=0;j<9;j++) {
			System.out.println("Wello!");
		}
		
		
	}

}
