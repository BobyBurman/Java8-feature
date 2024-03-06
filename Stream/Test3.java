package Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		
		int a=100;
		String str=Integer.toBinaryString(a);
		
		Map<String, Long> ma=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(ma);
		
		
		
		
		
	}

}
