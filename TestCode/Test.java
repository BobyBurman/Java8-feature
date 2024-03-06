package TestCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Test {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hd=new HashMap<Integer,String>();

		hd.put(1,"A");
		hd.put(2,"B");
		hd.put(3,"C");
		
		String a="A";
		
		hd.forEach((key,val)->{
					if(val.equals(a)) {
					System.out.println(key);
					}
				}
			);
		
		List<Integer> l=List.of(1,3,4,6,7,9,8);
		List<Integer> l1=l.stream().map(i->i*2).toList();
		System.out.println(l1);
		
		List<Integer> aa=new ArrayList<>();
		
		l.stream().filter(i->i%2!=0).forEach(System.out::println);
		
	}

}
