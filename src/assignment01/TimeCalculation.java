package assignment01;

/** 
 * This project take a UID as a input and calculates the total number into hours, minutes, and days
 * 
 * @author Jonas L. Jacobs
 * @version August 23, 2022
 *
 */

public class TimeCalculation {
	
	public static void main(String[] args) 
	{
		int UID = 1414741;
		
		System.out.println ("My uID number is u" + UID + ".");
		
		int min = UID / 60;
		int hrs = UID / 3600;
		
		System.out.println ( UID + " seconds is " + hrs + " hour(s), " + min % 60 + " minute(s), and " + UID % 60 + " second(s).");
	}

}
