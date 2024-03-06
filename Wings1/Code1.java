package Wings1;

import java.lang.*;
import java.util.*;

public class Code1 {
	
	public static int a(int arr[],int tar,int n) {
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(tar==sum) {
					count++;
				}
			}
		}
		return count;	
	}
	
	public static void main(String a[]) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t>0) {	
			int n=input.nextInt();
			int target=input.nextInt();
			int arr[]=new int[n];
			for(int k=0;k<n;k++) {
				arr[k]=input.nextInt();
			}
			System.out.println(a(arr,target,n));
			t--;
		}	
	}	
}
