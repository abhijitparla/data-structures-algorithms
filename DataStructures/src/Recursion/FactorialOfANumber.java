package Recursion;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number for which you want to find factorial:");
		int num = sc.nextInt();
		if(num<0){
			System.out.println("Do not enter a negative number!");
		}else {
			int factorial = getFactorial(num);	
			System.out.println("The factorial of "+num+" is: "+ factorial);
		}
		
	}

	private static int getFactorial(int num) {
			while(num>0) {
				 return num*getFactorial(num-1);
			}
			return 1;
	}

}
