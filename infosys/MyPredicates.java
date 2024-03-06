package infosys;

import java.util.function.Predicate;

public class MyPredicates {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p1=i->i<10;
		
		System.out.println(p1.test(10)); 
		
		Predicate<Integer> p2=s->s<6;
		
		System.out.println(p2.test(4)); 
		
		System.out.println(p1.negate().test(10));
		
		System.out.println(p1.or(p2).test(5));
		
		System.out.println(p2.or(p1).test(5));
		
		
	}

}
