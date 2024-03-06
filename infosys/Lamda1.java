package infosys;

import java.time.LocalDate;
import java.time.LocalTime;

/*class MyThread1 implements Runnable{
	
	@Override
	public void run() {
		
		 for(int i=0;i<5;i++) {
			 System.out.println("Welcome!");
		 }
		
	}
}*/

public class Lamda1 {
	
	public static void main(String[] args) {
		//Lambda exp -anonymous class
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				 System.out.println(LocalDate.now());
			 }
		};
		
		Thread t=new Thread(r);
		
		t.start();
		
		 for(int i=0;i<5;i++) {
			 System.out.println(LocalTime.now());
		 }
	}

}
