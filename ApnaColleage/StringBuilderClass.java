package ApnaColleage;

public class StringBuilderClass {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("h");
		sb.append("e");
		sb.append("xu");
		System.out.println(sb);
		sb.insert(2,"l");
		System.out.println(sb);
		sb.setCharAt(3, 'l');
		sb.setCharAt(4, 'o');
		System.out.println(sb);
		
		//reverse
		for(int i=0;i<sb.length()/2;i++) {
			
			int f=i;
			int b=sb.length()-1-i;
			
			char charF=sb.charAt(f);
			char charB=sb.charAt(b);
			
			sb.setCharAt(f,charB);
			sb.setCharAt(b,charF);
		}
		StringBuilder sb2=new StringBuilder(sb);
		System.out.println(sb2);
		
		sb.reverse();
		sb.deleteCharAt(0);
		System.out.println(sb);
	}

}
