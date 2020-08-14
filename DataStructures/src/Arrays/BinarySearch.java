package Arrays;
public class BinarySearch {

	public static void main(String[] args) {
		Integer arr[] = {2,4,5,8,9,10,3,4};
		int x = 4;
		int index = -1;
		int beg = 0;
		int end = arr.length-1;
		while(beg<=end) {
			int mid = (beg+end)/2;
			if(arr[mid] == x) {
				index = mid;
				break;
			}else if(arr[mid]<x) {
				beg = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println("THe index is: "+index);
	}

}
/*
 * beg 2  end = 4
 * mid = 3
 */
