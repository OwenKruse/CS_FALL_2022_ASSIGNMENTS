package assignment02;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = in.nextInt();
		int temp = num / 2;
		
			
		int digit0 = num % 2;
		int temp0 = temp;
		
		int digit1 = temp0 % 2;
		int temp1 = temp0 / 2;
		
		int digit2 = temp1 % 2;
		int temp2 = temp1 / 2;
		
		int digit3 = temp2 % 2;
		int temp3 = temp2 / 2;
		
		int digit4 = temp3 % 2;
		int temp4 = temp3 / 2;
		
		int digit5 = temp4 % 2;
		int temp5 = temp4 / 2;
		
		int digit6 = temp5 % 2;
		int temp6 = temp5 / 2;
		
		int digit7 = temp6 % 2;
//		The decimal number 0 is 00000000 in binary
		

		
		System.out.println("The decimal number " + num + " is " + Integer.toString(digit7) +Integer.toString(digit6) +Integer.toString(digit5) +Integer.toString(digit4) +Integer.toString(digit3) + Integer.toString(digit2) + Integer.toString(digit1) + Integer.toString(digit0) + " in binary.");

	}

}
