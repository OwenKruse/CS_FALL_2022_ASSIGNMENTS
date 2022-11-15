package assignment03;

/** 
 * program that uses a loop to output the powers of two from 2^0 through 2^16, inclusive
 * @author Jonas L. Jacobs
 * @version September 9, 2022
 *
 */

public class PowersOfTwo {

	public static void main(String[] args) {
		int count = 0;
		int power = 0;
		int num = 2;
		
		while (count < 16) {
			System.out.println(Math.pow(num, power));
			power++;
			count++;
		}
		
	}
	
}
