package Java1_8;



public class Threading4 {
	
	public static void main(String[] args) {
	
		
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<9;i++) {
					System.out.println("Hello!");
				}
			}
		};*/
		
		Runnable r=()->{
			for(int i=0;i<9;i++) {
				System.out.println("Hello!");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int j=0;j<9;j++) {
			System.out.println("Hello!");
		}
		
		
	}

}
