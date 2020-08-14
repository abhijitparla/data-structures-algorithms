package Recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want the sum of the digits:");
		int val = sc.nextInt();
		int result = getSum(val);
		System.out.println("The result is: "+result);
	}

	private static int getSum(int val) {
		int res = 0;
		while(val >=0) {
			if(val == 0) {
				return 0;
			}else {
				int x = val/10;
				int y = val%10;
				res = y + getSum(x);
				return res;
			}
		}
		return res;
	}

}
