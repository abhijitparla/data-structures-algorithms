package Arrays;
import java.util.Scanner;
/*
 * This is the program to rotate an array by d numbers anti clockwise. 
 * The Time Complexity of this is implementation is O(2N) --> O(N)
 * The Space Complexity of this program uses O(d) extra space as we are initializing
 * another array to store some values and copy back to the original array.
 * */
public class anticlockwiseRotationArray {
	public static void main(String[] srgs) {
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
		if(d>=arr.length) {
			d = arr.length%d;
		}
		Integer[] arr1 = new Integer[d];
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(i<d) {
				arr1[i] = arr[i];
			}else {
				arr[count] = arr[i];
				count++;
			}
		}
		int counter = 0;
		for(int k=arr.length-d; k<arr.length; k++) {
			arr[k] = arr1[counter];
			counter++;
		}
	}

}
