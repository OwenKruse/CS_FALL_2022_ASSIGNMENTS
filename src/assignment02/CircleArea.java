package assignment02;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		double area;
		
		Scanner in = new Scanner(System.in);
		radius = in.nextDouble();
		
		System.out.println((Math.PI * radius) * radius );

	}

}
