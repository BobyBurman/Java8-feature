package Wings1;
import java.util.*;
public class Code5 {
	
	//prime number
	public static boolean isPrime(int n) {		
		if(1<n && n<4) {
			return true;
		}
		for (int i = 2; i < (int)(Math.sqrt(n) + 1); i++) {
				if(n%i == 0) {
					return false;
				}
			}
		return true;
	}
	
	public static void main(String a[]) {
		int n=150;
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(n<=0 && n>10000) {
			System.out.println("Not possible1");
		}else if(isPrime(n)) {
			System.out.println("Not possible2");
		}else {
			int c=0;
			for(int i=2;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(i*j==n) {
						c++;
						System.out.println("("+i+","+j+")");
						int m=Integer.parseInt(i+""+j);
						System.out.println(m+" ");
						list.add(m);
					}
				}
			}
			System.out.println(c);
		}
		System.out.println("list :::"+list);
		Collections.sort(list);
		System.out.println("Sorted list :::"+list);
		System.out.println("list min:::"+list.get(0));
	}
}
