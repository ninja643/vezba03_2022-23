package rs.ac.ni.pmf.oop2.geometry.figures;

import rs.ac.ni.pmf.oop2.geometry.Point2D;

public class Rectangle
{
	private final Point2D bottomLeft;
	private final Point2D topRight;

	public Rectangle(Point2D bottomLeft, Point2D topRight)
	{
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}

	public Point2D getBottomLeft()
	{
		return bottomLeft;
	}

	public Point2D getTopRight()
	{
		return topRight;
	}
}
