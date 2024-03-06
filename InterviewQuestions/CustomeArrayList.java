package InterviewQuestions;

import java.util.*;

public class CustomeArrayList extends ArrayList{
   
	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}
	
	public static void main(String a[]) {
		
		CustomeArrayList list=new CustomeArrayList(); 
		
		 list.add("1");
		 list.add("2");
		 list.add("1");
		 list.add("2");
		
		System.out.println(list);
		
		
		Set<String> set=new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("b");
		set.add("d");
		
		//System.out.println(set);
	}
}
