package infosys;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {
	
	public static void main(String[] args) {
		
		//thread safe--->multiple tread can access it simultaneously
		
		Map<Integer,String> c=new ConcurrentHashMap<Integer, String>();
		c.put(1,"a");
		c.put(2,"b");
		c.put(1,"g");
		c.put(4,"b");
		 
		c.put(5,"f");
		
		c.forEach((key,value)->{
			if(key==4) {
				System.out.println(value);
			}
		});
		
		System.out.println(c);
		
		
	}
}
