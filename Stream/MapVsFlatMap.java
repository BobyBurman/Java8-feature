package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountedCompleter;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User{
	private int id;
	private String name;
	private List<String> phone;
	private List<String> email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, List<String> phone, List<String> email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
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
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}

public class MapVsFlatMap {
	public static void main(String[] args) {
		
		
		List<User> u=Stream.of(
				new User(1, "Boby Burman",Arrays.asList("9123866264"), Arrays.asList("iamboby000@gmail.com","bobybarmankolkata@gmail.com")),
				new User(2, "Chanda sharma", Arrays.asList("8777487774","9876556789"), Arrays.asList("iamcsk@cts.com")),
				new User(3, "Sayantan Dey", Arrays.asList("9876534563","9123487654"), Arrays.asList("sd@tcs.com","dey@citi.com"))
				).collect(Collectors.toList());
		
		
		u.stream().filter(i->i.getName().equals("Boby Burman")).forEach(i->System.out.println(i.getName()));
		
		List<String> a=u.stream().filter(i->i.getName().equals("Boby Burman")).map(i->i.getName()).toList();
		System.out.println(a);
		
		//map
		List<List<String>>phne=u.stream().map(i->i.getPhone()).collect(Collectors.toList());
		
		System.out.println(phne);
		
		//flat map
		List<String> p=u.stream().flatMap(i->i.getPhone().stream()).collect(Collectors.toList());
		System.out.println(p);
		
		String str1="BobyBurman";
		
		Map<String,Long>mp=Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mp);
	}

}
