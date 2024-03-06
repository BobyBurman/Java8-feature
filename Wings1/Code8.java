package Wings1;

import java.util.*;

//fibonachi series
public class Code8 {
	
	
	public static void main(String arr[]) {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		int a=0;
		int b=1;
		ArrayList<Integer> ar=new ArrayList<Integer>(); //0 1 1 2 3 5 8
		ar.add(a);
		ar.add(b);
		for(int i=2;i<n;i++) {
			int sum=0;
			sum=a+b;
			a=b;
			b=sum; 
			ar.add(sum);  
		}
		for(int i:ar) {
			System.out.print(i+" ");
		}
	}
	

}
