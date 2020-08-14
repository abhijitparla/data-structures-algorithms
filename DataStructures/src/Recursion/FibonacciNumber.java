package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the fibonacci: ");
		int val = sc.nextInt();
		int fib = getFibonacci(val);
		System.out.println("The answer is: "+fib);
	}

	private static int getFibonacci(int val) {
		int res = 0;
	while(val>=0) {
		if(val == 0) {
			return 0;
		}else if(val == 1) {
			return 1;
		}else {
			res = getFibonacci(val-1) + getFibonacci(val-2);
			return res;
		}
	}
		return res;
	}
}
