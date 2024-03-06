package infosys;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineFuctionalInterfaces {
	
	
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,40,55,66,78,89};
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
	    
		Predicate<Integer> p=p1.and(p2);
		
		for(int i:x) {
			System.out.println(p.test(i));
		}
		
		
		
		Function<String,String> f1=s->"10";
		
		Function<String,String> f2=s->"boby";
		
		Function<String,String> f=f1.compose(f2);
		
		System.out.println(f.apply("jhgf"));
		
		
		Consumer<String> c= s->System.out.println(s);
		c.accept("sdfghj");
		
		Supplier<Integer> s=()->10;
		System.out.println(s.get());
		
	}	
}
