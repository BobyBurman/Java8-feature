package ApnaColleage;

public class Recursive3 {
	
	public static int factor(int n) {	
		if(n==2 || n==1 ||n==0) {
		 return n;
		}		
		return factor(n-1)*n;	
	}
		
	public static void main(String[] args) {
		
		int n=4;
		int a=factor(4);
		System.out.println(a);
		
	}

}
