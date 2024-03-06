package infosys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomizedStudentSorting implements Comparable<CustomizedStudentSorting> {
	
	int id;
	String name;
	
	
	@Override
	public int compareTo(CustomizedStudentSorting o1) {
		if(id==o1.id) return 0;
		else if(id>o1.id) return 1;
		else return -1;
	}
	
	

	public CustomizedStudentSorting(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

    

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		
		CustomizedStudentSorting s1=new CustomizedStudentSorting(2,"B");
		CustomizedStudentSorting s2=new CustomizedStudentSorting(1,"A");
		CustomizedStudentSorting s3=new CustomizedStudentSorting(5,"E");
		CustomizedStudentSorting s4=new CustomizedStudentSorting(3,"C");
		CustomizedStudentSorting s5=new CustomizedStudentSorting(4,"D");
		
		ArrayList<CustomizedStudentSorting> l=new ArrayList<CustomizedStudentSorting>();
		
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		Collections.sort(l);
		
		//for(CustomizedStudentSorting i: l) {
			System.out.println(l);
		//}
		
	}

}
