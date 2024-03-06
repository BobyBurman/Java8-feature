package TestCode;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddUsingThreadLambda {
	
	private static Object object=new Object();
	
	private static IntPredicate even=i->i%2==0;
	private static IntPredicate odd=i->i%2!=0;
	
	
	public static void printCon(IntPredicate con) {	
		IntStream.rangeClosed(1,10).filter(con).forEach(EvenOddUsingThreadLambda::excecute);	
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		CompletableFuture.runAsync(()->EvenOddUsingThreadLambda.printCon(even));
		CompletableFuture.runAsync(()->EvenOddUsingThreadLambda.printCon(odd));
		Thread.sleep(1000);
	}

	
	private static void excecute(int i) {	
		synchronized(object) {
			try {
				System.out.println(Thread.currentThread().getName()+" "+i );
				object.notify();
				object.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
