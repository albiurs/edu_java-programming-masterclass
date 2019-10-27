package com.publicept;

public class Point {

	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public double distance() {
		double xA = this.x;
		double yA = this.y;
		double xB = 0.00d;
		double yB = 0.00d;
		//return Math.sqrt( (xB-xA) * (xB - xA) + (yB - yA) * (yB - yA) );
		return calculateDistance(xA, yA, xB, yB);
	}

	public double distance(int xB, int yB) {
		double xA = this.x;
		double yA = this.y;
		//return Math.sqrt( (xB-xA) * (xB - xA) + (yB - yA) * (yB - yA) );
		return calculateDistance(xA, yA, xB, yB);
	}

	public double distance(Point point) {
		double xA = this.x;
		double yA = this.y;
		double xB = point.x;
		double yB = point.y;
		//return Math.sqrt( (xB-xA) * (xB - xA) + (yB - yA) * (yB - yA) );
		return calculateDistance(xA, yA, xB, yB);
	}

	public double calculateDistance(double xA, double yA, double xB, double yB) {
		return Math.sqrt( (xB-xA) * (xB - xA) + (yB - yA) * (yB - yA) );
	}



	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}


}
