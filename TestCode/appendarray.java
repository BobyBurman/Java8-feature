package TestCode;

public class appendarray {
	public static void main(String[] args) {
		
		int a[]= {1,5,6,7};
		int n[]= {2,3,4};
		int k=1;
		int x[]=new int[a.length+n.length];
		
		for(int i=0;i<k;i++) {
			x[i]=a[i];
		}
		
		for(int i=k;i<k+n.length;i++) {
			x[i]=n[i-k];
		}
		for(int i=k+n.length;i<a.length+n.length;i++) {
			x[i]=a[i-n.length];
		}
		
		for(int i:x) {
			System.out.print(i+" ");
		}
		
	}

}
