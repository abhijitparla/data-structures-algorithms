package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		int count = getCount(x);
		System.out.println("The count is: "+count);

	}

	private static int getCount(int x) {
			while(x>0) {
				x = x/10;
				NumberOfDigits.count++;
				getCount(x);
				break;
			}
		return NumberOfDigits.count;
	}

}
