package assignment02;
import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lengthOne;
		double lengthTwo;

		System.out.println("Enter two side of a right triangle");

		Scanner in = new Scanner(System.in);

		lengthOne = in.nextDouble();
		lengthTwo = in.nextDouble();

		double computedVariable = Math.sqrt((Math.pow(lengthOne, 2) + Math.pow(lengthTwo, 2)));

		System.out.print(lengthOne + " and " + lengthTwo + " = " + computedVariable);

	}

}
