package Wings1;

public class Code9 {
	
	public static void main(String[] args) {
		
		String s="321";
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
			sum+=(int)s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				sum+=Integer.parseInt(s.substring(i, j+1));
				System.out.print(s.substring(i,j+1)+" ");
			}
			
		}
		System.out.println("sum:::"+sum);
	}

}
