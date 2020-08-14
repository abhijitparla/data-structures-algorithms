package Arrays;
import java.util.Scanner;
/*
 * Find the greatest index of a number less than or equal to the given input
 * Solution:
 * Find the number which is just greater than the input. Once you find that number which would be beg by the end of this iteration,
 * you can return beg-1 or end both are the greatest index less than or equal to the given input.
 */
public class BinarySearchDuplicateValues01 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int length = sc.nextInt();
		Integer[] array = new Integer[length];
		System.out.println("Enter the elements of Array:");
		for(int i=0; i<length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the number thet you want to search:");
		int x = sc.nextInt();
		int beg = 0;
		int end = length -1;
		while(beg<=end) {
			int mid = (beg+end)/2;
			if(array[mid] <= x) {
				beg = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println("The index is:"+end);

	}

}
