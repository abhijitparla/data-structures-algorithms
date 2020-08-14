package Recursion;

public class OneToNRecursion {
	public static void main(String[] args) {
		print(64);
	}

	private static void print(int i) {
		while(i>1) {
			print(i-1);
			break;
		}
		
		System.out.println(i);
	}
}
