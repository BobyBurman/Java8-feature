package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SteamApi {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		List<Integer> l2=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l3);
		
		long c1=l.stream().filter(i->i>9).count();
		System.out.println("elements in l which greater than '9': "+c1);
		
		long c2=l.stream().count();
		System.out.println("elements in l: "+c2);
		
		List<Integer> l4=l.stream().sorted().toList();
		System.out.println("Default sorting :: "+l4);
		
		List<Integer> l5=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Default sorting :: "+l5);
		
		List<Integer> l6=l.stream().sorted((i1,i2)->i1>i2?1:i1<i2?-1:0).collect(Collectors.toList());
		System.out.println("Default sorting :: "+l6);
		
		List<Integer> l7=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Customised sorting :: "+l7);
		
		List<Integer> l8=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Customised sorting :: "+l8);
		
		List<Integer> l9=l.stream().sorted((i1,i2)->i1>i2?-1:i1<i2?1:0).collect(Collectors.toList());
		System.out.println("Customised sorting : "+l9);
		
		
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Max:"+max+" Min:"+min);
		
		
		//l.stream().forEach(s->System.out.print(s+" "));
		
		l.stream().forEach(System.out::println);
		
		
		
	}

}
