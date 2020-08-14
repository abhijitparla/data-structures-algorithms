package Recursion;

import java.util.Scanner;

public class DigitalRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which ou want digital root: ");
		int x = sc.nextInt();
		int digitalRoot = getDigitalRoot(x);
		System.out.println("The digital root is: "+digitalRoot);
	}

	private static int getDigitalRoot(int x) {
		
		while(x>0) {
			int a = x/10;
		}
		return 0;
	}

}
