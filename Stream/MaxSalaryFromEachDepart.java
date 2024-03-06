package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	
	private String department;
	private String Name;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String department, String name, int salary) {
		super();
		this.department = department;
		Name = name;
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
	
}
public class MaxSalaryFromEachDepart {
	
	public static void main(String[] args) {
		
		List<Employee> emp=Stream.of(
				new Employee("DEV","Boby",5000),
				new Employee("DEV","Sayantan",6000),
				new Employee("PERF","Depika",9000),
				new Employee("QA","Ashok",8000),
				new Employee("QA","Maha",7000)
				).collect(Collectors.toList());
		
		Map<String, Optional<Employee>> e=emp.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println(e);
		
	}

}
