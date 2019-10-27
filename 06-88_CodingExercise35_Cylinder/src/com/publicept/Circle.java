package com.publicept;

public class Circle {

	private double radius;

	public Circle(double radius) {
		if(radius < 0) {
			this.radius = 0.0d;
		} else	{
			this.radius = radius;
		}
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return (getRadius() * getRadius() * Math.PI);
	}
}
