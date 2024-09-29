package Arrays;

public class InverseArraysValueWithIndex {
	
	public static void main(String[] args) {
	
		int[] arr = {2,0,4,1,3};
		int n = arr.length;
		
		int[] brr = new int[n] ;
		
		for(int i=0; i<n; i++) {
			brr[arr[i]] = i;
		}
		
		System.out.println("Array : ");
		for(int num : arr) System.out.print(num);
		
		System.out.println();

		System.out.println("InverseArraysValueWithIndex array : ");
		for(int num : brr) System.out.print(num);
		
	}

}
