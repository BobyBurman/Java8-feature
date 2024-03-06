package InterviewQuestions;

import java.util.ArrayList;
import java.util.*;

public class Student implements Comparable<Student>{
	
	public int id;
	
	public String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
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
	public int compareTo(Student s) {
		if (id == s.id)
			return 0;
		else if (id > s.id)
			return -1;
		else
			return 1;
	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	public static void main(String arr[]) {
		Student s0=new Student(5,"ellow");
		Student s1=new Student(1,"yellow");
		Student s2=new Student(2,"red");
		Student s3=new Student(3,"asky");
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s0);
		Collections.sort(list);
		System.out.println(list);
	}

	


}
