package Arrays;
import java.util.Scanner;

public class rotatingAnArraySpaceEfficient {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want to generate:");
		int len = sc.nextInt();
		Integer[] arr = new Integer[len];
		System.out.println("Enter the elements of array:");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number of for which you want to rotate:");
		int d = sc.nextInt();
		
	    rotate(arr,d);
	    System.out.println("rotated array:");
	    for(int j=0; j<arr.length; j++) {
	    	System.out.println(arr[j]);
	    }
	}

	private static void rotate(Integer[] arr, int d) {
		// TODO Auto-generated method stub
		int beg = 0;
		int end = d-1; 
		reverse(arr,beg,end);
		int beg1 = d;
		int end1 = arr.length-1;
		reverse(arr, beg1, end1);
		int beg2 = 0;
		int end2 =arr.length-1;
		reverse(arr, beg2, end2);
	}

	private static void reverse(Integer[] arr, int beg, int end) {
		while(beg<end) {
			int temp = arr[beg];
			arr[beg] = arr[end];
			arr[end] = temp;
			beg++;
			end--;
		}
		
	}
}
