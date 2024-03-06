package Java8;

import java.util.ArrayList;

class Student{
	
	public int id;
	public String name;
	
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
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
		
}

public class MyComparable {
	
	public static void main(String[] args) {
		
		Student s1=new Student(1,"Ranveer");
		Student s2=new Student(1,"Ashok");
		Student s3=new Student(1,"Joyanta");
		Student s4=new Student(1,"Abhishek");	
		
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		
		
	}
	
	

}
