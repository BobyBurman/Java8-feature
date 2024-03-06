package Wings1;
import java.util.*;
public class Code6 {
	
	public static boolean isPrime(int n) {
		if(n>1 && n<4) {
			return true;
		}else {
			for(int i=2;i<(int)(Math.sqrt(n)+1);i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String w[]) {
		
		Scanner in=new Scanner(System.in);
		int range=in.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=2;i<=range;i++) {
			if(isPrime(i)) {
				list.add(i);
			}else {
				list1.add(i);
			}
		}
		System.out.println("list:::"+list);
		System.out.println("list1:::"+list1);
	}

}
