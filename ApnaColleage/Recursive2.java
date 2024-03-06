package ApnaColleage;

public class Recursive2 {
	
	public static void printNum(int i,int n,int sum) {		
		if(n==i) {
			sum+=i;
			System.out.println(sum);
			return ;
		}		
		sum+=i;
		printNum(i+1,n,sum);		
	}
		
	public static void main(String[] args) {
		
		int n=4;
		printNum(1,n,0);
		
	}

}
