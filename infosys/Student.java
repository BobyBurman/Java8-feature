package infosys;

import java.util.ArrayList;
import java.util.Collections;

//public class Student implements Comparable<Student>{
public class Student {
	int id;
	String name;
	
	Student(int id,String name){
		this.name=name;
		this.id=id;
	}
	/*
	 * @Override public int compareTo(Student o) { if(id>o.getId()) { return -1;
	 * }else if(id<o.getId()) { return 1; }else { return 0; } }
	 */
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
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
	public static void main(String[] args) {
		
		ArrayList<Student> l=new ArrayList<Student>();
		
		Student s1=new Student(1,"A");
		Student s2=new Student(4,"D");
		Student s3=new Student(3,"C");
		Student s4=new Student(2,"A");
		Student s5=new Student(2,"B");
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		System.out.println(l);
		
		Collections.sort(l,(I1,I2)->I1.getId()>I2.getId()?-1:I1.getId()<I2.getId()?+1:I2.getName().compareTo(I1.getName()));
		System.out.println(l);
		
	}

}
