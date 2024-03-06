package infosys;

interface i4{
	public static void mq() {
		System.out.println("mq");
	}
}

public class StaticMethods implements i4 {
	
	public static void main(String[] args) {
		i4.mq();
	}
}
