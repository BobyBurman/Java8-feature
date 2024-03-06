package Java1_8;

import java.util.ArrayList;

class MyArrayList extends ArrayList<Integer>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(Integer i) {
		
		if(this.contains(i)) {
			return true;
		}
		return super.add(i);
	}
}

public class CustomisedArrayList {
	
	public static void main(String[] args) {
		
		MyArrayList l=new MyArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(5);
		
		System.out.println(l);
		
	}

}
