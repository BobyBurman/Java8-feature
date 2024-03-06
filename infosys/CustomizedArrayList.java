package infosys;

import java.util.ArrayList;
import java.util.List;

public class CustomizedArrayList extends ArrayList{
	
	
	@Override
	public boolean  add(Object o) {
		if(this.contains(o)) {
			return true;
		}else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		
		CustomizedArrayList l=new CustomizedArrayList();
		 
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		
	}
	
}
