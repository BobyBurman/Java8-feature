package infosys;



class MyThread implements Runnable{
	
	public void run(){
		for(int i=1;i<5;i++) {
			System.out.println("welcome to");
		}
	}
}
 
public class Treading {
	
	public static void main(String arr[]) {
		
		Runnable r=new MyThread();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<5;i++) {
			System.out.println("Infosys");
		}
	}

}
