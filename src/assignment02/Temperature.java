package assignment02;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempF;
		
		System.out.println("Enter a temperature in Fahrenheit and I will convert it to Celsius");
		
		Scanner in = new Scanner(System.in);
		tempF = in.nextInt();
		
		double convertedTemp = ((0.5555556) * (tempF - 32));
		
		System.out.println(tempF + " Fahrenheit converted to celsius is " + (int)(convertedTemp));
		
	}

}
