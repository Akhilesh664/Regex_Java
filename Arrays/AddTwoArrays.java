package Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		
		
		int[] arr = {4, 5, 2, 0};
		int n = arr.length;
		int i = n-1;
		
		int[] brr = {3, 4, 5, 4, 0, 7};
		int m = brr.length;
		int j = m-1;
		
		int p = Math.max(n, m);
		int[] crr = new int[p];
		int k = p-1;
		
		
		while(i >= 0 && j>=0 ) {
			int sum = arr[i] + brr[j];
			crr[k] = sum;
			k--;
			i--;
			j--;
		}
		
		while(i >= 0) {
			crr[k] = arr[i];
			k--;
			i--;
		}

		while(j >= 0) {
			crr[k] = brr[j];
			k--;
			j--;
		}
		
		
		for(int num : crr) System.out.print(num + "  ");
		
	}
	
}
