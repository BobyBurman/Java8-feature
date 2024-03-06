package ApnaColleage;

public class BitManipulation {
	
	public static void main(String[] args) {
		
		int a=12;
		
		//Decimal to Binary
		String binary=Integer.toBinaryString(a);
		System.out.println("Decimal to Binary::"+binary+" Type::"+binary.getClass());
		
		//Binary to Integer
		Integer a1=Integer.parseInt(binary);
		System.out.println("Binary to Integer::"+a1+" Type::"+a1.getClass().getName());
		
		System.out.println(Integer.bitCount(a1));
		
		//System.out.println(Integer.highestOneBit(19));
		
		
		//Binary to Decimal
		Integer d1=Integer.parseInt(binary,2);
		System.out.println("Binary to Decimal:::"+d1);
		
		//****************************************************************
		//Decimal  to Octal
		String octal=Integer.toOctalString(a);
		System.out.println("Decimal  to Octal::"+octal+" Type::"+octal.getClass());
		
		//Octal to decimal
		Integer d2=Integer.parseInt(octal,8);
		System.out.println("Octal to decimal:::"+d2);
		
		//****************************************************************
		//Decimal to Hexa
		String hexa=Integer.toHexString(a);
		System.out.println("Decimal to Hexa::"+hexa+" Type::"+hexa.getClass());
		
		Integer d3=Integer.parseInt(hexa,16);
		System.out.println("Decimal to hexa:::"+d3);
		
	}

}
