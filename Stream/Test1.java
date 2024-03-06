package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	
	
	public static void main(String[] args) {
		
	    List<Integer> l=Arrays.asList(3,4,2,1,5);
	    
	    l.forEach(i->{
	    	if(i%2==0) {
	    		//System.out.println(i);
	    	}
	    });
	    
	    Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	    Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(max +" - "+min);
		
		l.sort((i1,i2)->-i1.compareTo(i2));
		
		//System.out.println(l);
		
		List<Integer> l2=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		//System.out.println(l2);
		
		
		List<Integer> a =List.of(23,4,6,8,9,1,2,10);
		List<Integer> a1 =List.of(23,4,6,8,9,1,2,10);
		
		a1.stream().filter(i->i%2==0).forEach(i->System.out.print(i*2+" "));System.out.println();
		
		
		List<Integer> as=a1.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList());
		
		System.out.println(as);
		
		List<Integer> l3=a.stream().filter(i->i>4 && i<50).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l3);
		
		
		
		
	}

}
