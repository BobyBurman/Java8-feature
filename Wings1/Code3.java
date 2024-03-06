package Wings1;

public class Code3 {
	
	public static void main(String arr[]) {
		
		
		String str="9 4 20 3 10 5";
		
		String s[]=str.split(" ");
		int ar[]=new int[s.length];
		for(int i=0;i<s.length;i++) {
			ar[i]=Integer.parseInt(s[i]);
			
		}
		for(int i:ar) { 
			System.out.print(i+" ");
		}
		
	}

}
