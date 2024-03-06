package Wings1;

import java.util.*;

public class Code2 {
	public static int sub(int[] arr,int len,int tar) {
		int c=0;
		for(int i=0;i<len;i++) {
			int sum=0;
			for(int j=i;j<len;j++) {
				sum=sum+arr[j];
				if(sum==tar) {
					c++;
				}
			}
		}
		return c;
	}
	public static void main(String arr[]) {
		
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		
		while(t>0) {
			int target=input.nextInt();
			String s=input.next();
			System.out.println("S = "+s);
			String str[]=s.split(","); 
			int l=str.length;
			System.out.println("l = "+l);
			int ar[]=new int[l];
			for(int i=0;i<l;i++) {
				ar[i]=Integer.parseInt(str[i]);
				System.out.println(Integer.parseInt(str[i]));
			}
			System.out.println(sub(ar,l,target));
			t--;
		}
	}

}
