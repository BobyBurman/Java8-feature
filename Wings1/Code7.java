package Wings1;

import java.util.*;

//Palindrom
public class Code7 {
	
	public static boolean isPalin(String s) {
		String as="";
		ArrayList<Character> l1=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			l1.add(s.charAt(i));
		}
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		for(Character i:l1) {
			as=as+i;
		}
		System.out.println(as);
		if(s.equalsIgnoreCase(as)) {
			return true;
		}
		return false;
	}
	
	public static void main(String str[]) {
		
		Scanner in=new Scanner(System.in);
		
		int f=in.nextInt();
		
		String s=String.valueOf(f);
		
		//String s=in.next();
		
		if(isPalin(s)) {
			System.out.println(s+" is palindrom");
		}else {
			System.out.println(s+" is not palindrom");
		}
		
	}
}
