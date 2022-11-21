package rs.ac.ni.pmf.oop2.geometry.figures;

import rs.ac.ni.pmf.oop2.geometry.Point2D;

/**
 * Class that represents the circle in plane. Coordinates of center are integers and
 * radius is double.
 */
public class Circle
{
	private final Point2D center;
	private final double radius;

	public Circle(Point2D center, double radius)
	{
		this.center = center;
		this.radius = radius;
	}

	public Point2D getCenter()
	{
		return center;
	}

	public double getRadius()
	{
		return radius;
	}
}
