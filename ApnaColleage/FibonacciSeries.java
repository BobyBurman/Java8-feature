package ApnaColleage;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		 int a =0;
		 int b=1;
		 int n=7;
		 System.out.println(a);
		 System.out.println(b);
		 fibo(a,b,n-2);
	}

	private static void fibo(int a, int b, int n) {
		
		if(n==0) {
			return;
		}
		
		int c=a+b;
		System.out.println(c);
		fibo(b,c,n-1);
		
	} 

}
