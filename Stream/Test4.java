package Stream;

import java.util.HashMap;

public class Test4 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("a",1);
		hm.put("b",2);
		hm.put("c",3);
		hm.put("d",4);
		
		hm.forEach((i,j)->{
			if(hm.get(i)==1) {
				System.out.println(i);
			}
		});
	
		
		
		
	}
}
