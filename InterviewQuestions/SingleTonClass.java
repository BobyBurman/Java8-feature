package InterviewQuestions;

class Singleton{
	//Transient - A different instance of a resource, everytime it's requested.
	public static transient Singleton instance=null;
	
	private Singleton() {
		
	}
	public synchronized static Singleton getObject() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class SingleTonClass{
	 public static void main(String args[])
	    {
	        // Instantiating Singleton class with variable x
	        Singleton x = Singleton.getObject();
	        
	        System.out.println(x.hashCode());
	        
	        
	    }
	
     
}
