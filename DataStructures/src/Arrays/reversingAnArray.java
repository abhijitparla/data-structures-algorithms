package Arrays;

public class reversingAnArray {

	public static void main(String[] args) {
		Integer arr[] = {3,5,4,9,7};
		reverse(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void reverse(Integer[] arr) {
		int beg = 0;
		int end = arr.length-1;
		while(beg<end) {
			swap(beg, end, arr);
			beg++;
			end--;
		}
		
	}

	private static void swap(int beg, int end, Integer[] arr) {
		int temp = arr[beg];
		arr[beg] = arr[end];
		arr[end] = temp;
	}

}
