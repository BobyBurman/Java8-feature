package TestCode;

public class RollingArray {
	
	void leftRotate(int arr[], int d, int n) {
		// Creating temp array of size d
		int temp[] = new int[d];

		// Copying first d element in array temp
		for (int i = 0; i < d; i++)
			temp[i] = arr[i];

		// Moving the rest element to index
		// zero to N-d
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		// Copying the temp array element
		// in original array
		for (int i = 0; i < d; i++) {
			arr[i + n - d] = temp[i];
		}
		
	}

	// Method 2
	// To print an array
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void leftshift(int[] a,int r) {
		
		int temp[]=new int[r];
		int l=a.length;
		
		for(int i=0;i<r;i++) { 
			temp[i]=a[i];
		}
		
		for(int i=0;i<l-r;i++) {
			a[i]=a[i+r];
		}
		
		for(int i=0,j=l-r;i<r&&j<l;i++,j++) {
			a[j]=temp[i];
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String arr[]) {
		
		int a[]= {1,2,3,4,5,6};
		
		int r =3;
		
		leftshift(a,r);
		
	}

}
