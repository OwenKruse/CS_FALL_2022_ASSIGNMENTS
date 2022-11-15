package assignment03;

/** 
 * This is called the Hailstone sequence and it is related to the Collatz conjecture.  The conjecture states that eventually this series will converge to 1 no matter what starting positive integer is chosen.
 * @author Jonas L. Jacobs
 * @version September 9, 2022
 *
 */

import java.util.Scanner;

public class Hailstone {

	public static void main(String[] args) {
		int num;
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		System.out.print(num +  " ");
		
		
		while (num != 1 && num > 0) {
			if (num % 2 == 1) {
				num = (num * 3) +1;
				count++;
				System.out.print(num + " ");
			} else {
				num = num /2;
				count++;
				System.out.print(num + " ");
			}
		}
		System.out.print(count);

	}

}
