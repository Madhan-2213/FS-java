package jfs;

public class fsd {

	public static void main(String[] args) {
		int n = 6;
		int[] arr = {1,2,3,4,5,6};
		for(int i=0;i<n-1;i+=2) {
			arr[i] = arr[i]^arr[i+1];
			arr[i+1] = arr[i]^arr[i+1];
			arr[i]=arr[i]^arr[i+1];
			
		}
		for(int k = 0;k<6;k++) {
			System.out.print(arr[k]);
		}

	}

}
