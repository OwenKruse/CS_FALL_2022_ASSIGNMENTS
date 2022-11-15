package assignment06;

public class FractionTester {

	public static void main(String[] args) {
			boolean errors = false;
		  Fraction a = new Fraction (2, 3);
		    Fraction b = new Fraction (1, 5);
		    
		    Fraction d = new Fraction (2, 1);
		    long interation = 4;

		    Fraction i = a.divide(b);
		    Fraction f = a.add(b);
		    Fraction z = a.subtract(b);
		    Fraction c = a.multiply(b);
		    
	    if (a.getNumerator() != 2 || a.getDenominator() != 3 ||
	        b.getNumerator() != 1 || b.getDenominator() != 5 ||
	        c.getNumerator() != 6 || c.getDenominator() != 5) {
	        errors = true;
	    
	    } else if (a.getNumerator() != 2 || a.getDenominator() != 3 ||
	        b.getNumerator() != 1 || b.getDenominator() != 5 ||
	        f.getNumerator() != 3 || f.getDenominator() != 10) {
	        errors = true;
	        
	    } else if ((a.getNumerator() != 1 || b.getDenominator() != 4 ||
		        a.getNumerator() != 1 || a.getDenominator() != 2 ||
		        i.getNumerator() != 2 || i.getDenominator() != 4)) {
	        errors = true; 
	    } else if (a.getNumerator() != 2 || a.getDenominator() != 1 ||
		        b.getNumerator() != 1 || b.getDenominator() != 2 ||
		        z.getNumerator() != 1 || z.getDenominator() != 4) {
	        errors = true;
	    }
	    
	    if(errors == true) {
    		  System.out.println("All tests completed, errors found.");
    	} else {
    		  System.out.println("All tests completed, no errors.");
    	}

	}

}
