package Java1_8;

class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<9;i++) {
			System.out.println("Welcome!");
		}
		
	}
	
}

public class Threading1 {
	
	public static void main(String[] args) {
	
		
		Runnable r=new MyThread();
		Thread t=new Thread(r); 
		t.start();
		
		for(int j=0;j<9;j++) {
			System.out.println("Hello!");
		}
		
		
	}

}
