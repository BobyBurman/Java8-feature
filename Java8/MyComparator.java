package Java8;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	
	public int id;
	public String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
		
}
public class MyComparator {
	
	public static void main(String[] args) {
		
		Student s1=new Student(1,"Boby");
		Student s2=new Student(2,"Kelo");
		Student s3=new Student(3,"Chelo");
		Student s4=new Student(4,"Melo");
		Student s5=new Student(5,"chelo");
		
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		System.out.println("Before :::"+l);
		//Collections.sort(l, (o1,o2)->o1.getId()>o2.getId()?-1:o1.getId()<o2.getId()?1:o1.getName().compareTo(o2.getName()));
		System.out.println("After :::"+l);
	}

}
