package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Fast_Safe {
	
	public static void main(String[] args) {
		
		//fail fast
		//List<Integer> l=new ArrayList<>(); -- > fail fast
		List<Integer> l=new CopyOnWriteArrayList<>(); //solution ---fail safe
		l.add(2);
		l.add(3);
		l.add(4);
		
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			l.add(8);
		}
		
		//using map
		//Map<Integer,String> m=new HashMap<Integer, String>();
		Map<Integer,String> m=new ConcurrentHashMap<Integer, String>();
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		
		Iterator<Integer> it=m.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer)it.next();
			System.out.println(key+"---"+m.get(key));
			m.put(4, "D");
		}
		
		
	}

}
