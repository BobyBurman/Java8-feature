package Java8;

import java.util.function.Supplier;

//password generator
//Rules::: -->8 digit;
public class MySupplier {
	
	public static void main(String[] args) {
		
		
		Supplier<String> s=()->{
			
			String pwd="";
			
			//making digits
			Supplier<Integer> d=()->(int)(Math.random()*10);
			
			//making symbols
			
			String symbols="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()";
			
			
			Supplier<Character> c=()->symbols.charAt((int)(Math.random()*61));
			
			for(int j=1;j<=8;j++) {
				
				if(j%2==0) {
					pwd=d.get()+pwd;
				}else {
					pwd=c.get()+pwd;
				}
				
			}
			return pwd;
		};
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		System.out.println("Password "+s.get());
		
		
	}

}
