package assignment06;

public class Fraction {
	private long numerator;
	private long denominator;

	/**
	 * creates a fraction with two long inputs and ensures the fraction is in
	 * reduced form 10/2 becomes 5/2 and 1/-3 becomes -1/3
	 * 
	 * @param n
	 * @param d
	 */
	public Fraction(long n, long d) {
		long gcd = 0;
		long remainder = 0;
		long temp;
		
		long Num1 = n;
		long Num2 = d; 
		
		while(Num2 != 0)  
		{  
		temp = Num2;  
		Num2 = Num1 % Num2;  
		Num1 = temp;  
		}  
		gcd = Num1;  
		if(n < 0 && d < 0) {
			this.numerator = Math.abs(n) / Math.abs(gcd);
			this.denominator = Math.abs(d) / Math.abs(gcd);
		} else if (n < 0) {
			this.numerator = (Math.abs(n) / Math.abs(gcd)) * -1;
			this.denominator = Math.abs(d) / Math.abs(gcd);
		} else if (d < 0) {
			this.numerator = (Math.abs(n) / Math.abs(gcd)) * -1 ;
			this.denominator = Math.abs(d) / Math.abs(gcd);
		} else {
			this.numerator = n / gcd;
			this.denominator = d / gcd;
		}
		
	}

	/**
	 * creates a fraction with a single long input 12 becomes 12/1
	 * 
	 * @param num
	 */
	public Fraction(long num) {
		this.numerator = num;
		this.denominator = 1;
	}

	/**
	 * allows the user to have a nicly printed out fraction of the desired instance
	 */
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	/**
	 * allows the user to get the denominator sting outside of the Fraction function
	 * without it being public and therefore mutable outside of the class
	 * 
	 * @return
	 */
	public long getNumerator() {
		return numerator;
	}

	/**
	 * allows the user to get the numerator sting outside of the Fraction function
	 * without it being public and therefore mutable outside of the class
	 * 
	 * @return
	 */
	public long getDenominator() {
		return denominator;
	}

	/**
	 * converts this.numerator and this.denominator to a double and divides them
	 * converting it to a double and returning it
	 * 
	 * @return
	 */
	public double toDouble() {
		double converted = ((double) this.numerator) / ((double) this.denominator);

		return converted;
	}

	/**
	 * Allows the user to multiply two Fraction instances together and return the
	 * results
	 * 
	 * @param rightHandSide
	 * @return
	 */
	public Fraction multiply(Fraction rightHandSide) {
		Fraction result;
			result = new Fraction(this.numerator * rightHandSide.numerator,
					this.denominator * rightHandSide.denominator);

		return result;
	}

	/**
	 * allows the user to input two Fraction objects and subtracts checks which
	 * denominator is larger and finds the GCD accounting for the numerator and
	 * subtracting then the result is sent to the Fraction constructor and reduced
	 * to simplified form.
	 * 
	 * @param rightHandSide
	 * @return
	 */
	public Fraction subtract(Fraction rightHandSide) {
		long x;
		long y;

		if (this.numerator == 0 && rightHandSide.numerator < 0) {
			x = Math.abs(rightHandSide.numerator);
			y = (this.denominator * rightHandSide.denominator);
		} else if (rightHandSide.numerator == 0) {
			x = this.numerator;
			y = (this.denominator * rightHandSide.denominator);
		} else if (this.numerator < 0 || rightHandSide.numerator < 0){
			x = ((Math.abs(this.numerator) * Math.abs(rightHandSide.denominator)) - (Math.abs(rightHandSide.numerator) * Math.abs(this.denominator)) * -1);
			y = ((this.denominator * rightHandSide.denominator) * -1);
		} else {
			x = ((this.numerator * rightHandSide.denominator) - (rightHandSide.numerator * this.denominator));
			y = (this.denominator * rightHandSide.denominator);
		}

		Fraction result = new Fraction(x, y);

		return result;
	}

	/**
	 * allows the user to input two Fraction objects and adds them together checks
	 * which denominator is larger and finds the GCD accounting for the numerator
	 * and then adding. the result is sent to the Fraction constructor and reduced
	 * to simplified form.
	 * 
	 * @param rightHandSide
	 * @return
	 */
	public Fraction add(Fraction rightHandSide) {
		long x;
		long y;

		if (this.numerator == 0) {
			x = rightHandSide.numerator;
			y = (this.denominator * rightHandSide.denominator);
		} else if (rightHandSide.numerator == 0) {
			x = this.numerator;
			y = (this.denominator * rightHandSide.denominator);
		} else {
			x = ((this.numerator * rightHandSide.denominator) + (rightHandSide.numerator * this.denominator));
			y = (this.denominator * rightHandSide.denominator);
		}

		Fraction result = new Fraction(x, y);

		return result;
	}

	/**
	 * Allows the user to divide two Fraction instances together and return the
	 * results flipping the numerator and denominator and multiplying
	 * 
	 * @param rightHandSide
	 * @return
	 */
	public Fraction divide(Fraction rightHandSide) {
		Fraction result;
		
		if(this.numerator < 0 && rightHandSide.denominator < 0) {
			result = new Fraction(Math.abs(this.numerator) * Math.abs(rightHandSide.denominator), this.denominator * rightHandSide.numerator);
		} else {
			result = new Fraction(this.numerator * rightHandSide.denominator, this.denominator * rightHandSide.numerator);

		}
		return result;
	}

}
