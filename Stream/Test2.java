package Stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Test2 {
	public static void main(String[] args) {
		
		String s[]= {"geeks","of","geeks","spring boot"};
		
		Optional<String> str=Arrays.stream(s).reduce((s1,s2)->s1.length()>s2.length()?s1:s2);
		
		str.ifPresent(System.out::println);
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		//OptionalInt a1=Arrays.stream(a).reduce((s1,s2)->s1>s2?s1:s2);
		Integer a1=Arrays.stream(a).max().getAsInt();
		System.out.println(a1);
		
		Integer a2=Arrays.stream(a).sum();
		System.out.println(a2);
		
		OptionalInt a3=Arrays.stream(a).reduce((s1,s2)->s1+s2);
		System.out.println(a3);
		
	}

}
