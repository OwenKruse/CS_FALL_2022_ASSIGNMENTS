package assignment06;

import java.util.Scanner;

public class FractionRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//numerator
		long n = s.nextLong();
		//demoninator
		long d = s.nextLong();
		
		//Approximation
		long Z = s.nextLong();
		//users fraction
		Fraction S = new Fraction(n, d);
		//used to canculate S/2
		Fraction divideTwo = new Fraction(2,1);
		//this is initalizing x_0
		Fraction half = new Fraction(1,2);
		Fraction x = S.divide(divideTwo);
		
		for(int i = 0; i < Z; i++) {
			x = half.multiply((x.add((S.divide(x)))));
		}
		
		System.out.println("The square root of " + n + "/" + d + " is approximately " + x + ".");
		
	}

}
