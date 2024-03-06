package leetcode;

import java.lang.*;
import java.util.*;

public class Wings1 {
	
	public static void main(String arr[]) {
		
		Scanner s=new Scanner(System.in);
		
		int test=s.nextInt();
		while(0<test) {
			
			int target=s.nextInt();
			
			
			
			String str=s.next();
			
			
			String a[]=str.split("");
			
			int ai[]=new int[a.length];
			
			for(int k=0;k<a.length;k++) {
				ai[k]=Integer.parseInt(a[k]);
			}
			
			int c=0;
			for(int m=0;m<ai.length;m++) {
				for(int n=m+1;n<ai.length;n++) { 
					int sum=ai[m]+ai[n];
					if(target==sum) {
						c=c+1;
					}
				}
			}
			System.out.println(c);
			test--;
		}
		
		
	}

	
}
