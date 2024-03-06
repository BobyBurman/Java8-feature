package TestCode;

class Mytread implements Runnable{
	

	static int i=1;
	static Object object=new Object();
	
	@Override
	public void run() {
		while(i<10) {
			if(i%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					
					System.out.println(Thread.currentThread().getName()+" - "+i);
					i++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			} 
			if(i%2!=0 && Thread.currentThread().getName().equals("odd")){
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + " - " +i);
					i++;
					object.notify();
				}
			}
			
		}
		
	}
}

public class EvenOddUsingThread {

	
	public static void main(String[] args) {
		
		Runnable r1=new Mytread();
		Runnable r2=new Mytread();
		
		Thread t1=new Thread(r1,"even");
		Thread t2=new Thread(r2,"odd");
		
		t1.start();
		t2.start();
		
	}

}
