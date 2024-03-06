package infosys;


class Singleton{
	
	private static volatile transient Singleton instance=null;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getObject() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	
 	
}
public class MySingleTonClass {
	
	public static void main(String[] args) {
		
		Singleton s1=Singleton.getObject();
		Singleton s2=Singleton.getObject();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
