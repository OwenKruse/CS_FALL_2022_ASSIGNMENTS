package path;

//

/**
 * this class holds path objects with accessory methods in order to make drawing, saving, and loading easier
 * 
 * @author Jonas Jacobs
 * @Version November 6, 2022
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Path {
		ArrayList<Point> points = new ArrayList<Point>();
		Scanner in = new Scanner(System.in);
		int pointCount = 0;

		public Path(Scanner s) {
			pointCount = Integer.valueOf(s.next());
			while(s.hasNext()) {
				Point tempPoint = new Point(Integer.valueOf(s.next()),Integer.valueOf(s.next()));
				points.add(tempPoint);
			}
		}

	public Path() {

	}

	/**
	 * Given a percentage between 0% and 100%, this method calculates
	 * the location along the path that is exactly this percentage
	 * along the path. The location is returned in a Point object
	 * (integer x and y), and the location is a screen coordinate.
	 *
	 * If the percentage is less than 0%, the starting position is
	 * returned. If the percentage is greater than 100%, the final
	 * position is returned.
	 *
	 * Callers must not change the x or y coordinates of any returned
	 * point object (or the caller could be changing the path).
	 *
	 * @param percentTraveled a distance along the path
	 * @return the screen coordinate of this position along the path
	 */

	public Point convertToCoordinates(double percentTraveled) {
		double distanceTraveled = 0;

		for(int i = 0; i < points.size() - 1; i++) {
			double gotY = Math.pow(points.get(i).getY() - points.get(i + 1).getY(), 2);
			double gotX = Math.pow(points.get(i).getX() - points.get(i + 1).getX(), 2);
			distanceTraveled += Math.sqrt(gotY + gotX);
		}
//		System.out.println(percentTraveled);
		double distanceToTravel = distanceTraveled * percentTraveled;
		double Traveled = 0;
		int segment = 0;

		for(int i = 0; i < points.size() - 1; i++) {
			double gotY = Math.pow(points.get(i).getY() - points.get(i + 1).getY(), 2);
			double gotX = Math.pow(points.get(i).getX() - points.get(i + 1).getX(), 2);
			double j = Traveled + Math.sqrt(gotY + gotX);
			if(j >= distanceToTravel)
			{
				break;
			}

			Traveled = Traveled + Math.sqrt(gotY + gotX);
			segment = i;

		}

		double distance = distanceToTravel - Traveled;
		double newY = Math.pow(points.get(segment).getY() - points.get(segment + 1).getY(), 2);
		double newX = Math.pow(points.get(segment).getX() - points.get(segment + 1).getX(), 2);
		double percentTraveledInSegment = distance / Math.sqrt(newY + newX);

		double x = (1 - percentTraveledInSegment) * points.get(segment).getX() + percentTraveledInSegment * points.get(segment + 1).getX();
		double y = (1 - percentTraveledInSegment) * points.get(segment).getY() + percentTraveledInSegment * points.get(segment + 1).getY();

		System.out.println("x: " + x + " y: " + y);
		Point tempPoint = new Point((int)x, (int)y);
		return tempPoint;
	}

	public int getPointCount() {
			return pointCount;
		}
		
		public int getX(int n) {
			return (int) (points.get(n).getX());
		}
		
		public int getY(int n) {
			return (int) (points.get(n).getY());
		}
		public void add(int x, int y) {
			Point temp = new Point(x,y);
			pointCount++;
			points.add(temp);
		}
		
		public String toString() {
			String temp = "" + pointCount + "\n";

			for (int i = 0; i < pointCount; i++) {
				temp = temp + (int) points.get(i).getX() + " ";
				temp = temp + (int) points.get(i).getY() + "\n";
			}
			return temp;
		}
}
