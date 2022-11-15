package assignment03;

/** 
 * Write a Java program that prints a nice prompt and asks the user for a sequence length X, then prints out the smallest positive starting N such that the Hailstone sequence for N takes exactly X iterations/steps.  When you print out the starting N, use a nice message of this form (replacing X and N with numbers): 
 * @author Jonas L. Jacobs
 * @version September 9, 2022
 *
 */

import java.util.Scanner;

public class HailstoneSearch {

	public static void main(String[] args) {
		int answer = 0;
		int x = 0;
		int count = 0;

		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		for(int n = 2; n <= x; n++) {
			answer = n;
			count = 0;
			while (answer != 1) {
				if (answer % 2 == 0) {
					answer = answer / 2;
				} else {
					answer = (answer * 3) + 1;

				}
				count++;
			}
			if(count == x) {
				break;
			}
		}
		
		System.out.print("The Hailstone sequence starting at " + x + " takes " + count + " steps to converge to 1.");

	}

}
