package Arrays;
import java.util.Scanner;

public class linearSearchInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want to create:");
		int len = sc.nextInt();
		Integer[] arr = new Integer[len];
		System.out.println("Enter the "+len+" elements of array:");
		for(int j=0; j<len; j++) {
			arr[j] = sc.nextInt();
		}
		System.out.println("Enter the index of the element you want to find:");
		int x = sc.nextInt();
//		Integer arr[] = {3,4,5,3,4,6};
//		int x = 4;
		int index = -1;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == x) {
				index = i;
				break;
			}
		}
		System.out.println("The index of your inout is: "+index);

	}

}
