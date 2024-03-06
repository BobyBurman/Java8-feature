package infosys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {
	
	public static void main(String[] args) {
		
		
		List<Integer> l1=List.of(1,3,4,6,8,9);
		List<Integer> l2=new LinkedList<Integer>();
		System.out.println(l1.get(0));
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(23);
		s.add(4);
		s.add(1);
		System.out.println(s);
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1,"a");
		m.put(4,"b");
		m.put(3,"a");
		m.put(2,"b");
		
		System.out.println(m);
		
		
	}

}
