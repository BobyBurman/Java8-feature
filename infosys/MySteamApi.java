package infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySteamApi {
	
	public static void main(String[] args) {
		
		List<Integer> l= List.of(2,3,4,5,6,7,8);
		
		List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(l1);
		
		Long c=l.stream().filter(j->j%2!=0).count();
		
		System.out.println(c);
		
		List<Integer> st=l.stream().sorted().collect(Collectors.toList());
		
		System.out.println(st);
		
		List<Integer> std=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println(std);
		
		Integer mx=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		Integer mn=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Max ::"+mx+" min::"+mn);
		
		l.stream().forEach(i->System.out.println(i));
		
		l.stream().forEach(System.out::println);
		
		Integer[] ar=l.stream().toArray(Integer[]::new);
		for(Integer i:ar) {
			System.out.println(i);
		}
		
		Integer[] a= {2,3,4,5};
		Stream<Integer> s=Stream.of(a);
		s.forEach(System.out::println);
		
		
		
	}

}
