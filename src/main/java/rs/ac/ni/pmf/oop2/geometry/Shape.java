package rs.ac.ni.pmf.oop2.geometry;

import java.util.List;
import rs.ac.ni.pmf.oop2.geometry.Point2D;
import rs.ac.ni.pmf.oop2.geometry.figures.Circle;
import rs.ac.ni.pmf.oop2.geometry.figures.Rectangle;

public interface Shape
{
	/**
	 * @return Total number of points
	 */
	int count();

	/**
	 * Computes the circle of minimal radius that contains all the points from the set
	 *
	 * @return minimal {@link Circle} that covers the points
	 */
	Circle minimalCoveringCircle();

	/**
	 * Checks if given {@link Rectangle} completely covers the shape
	 *
	 * @param rectangle
	 * @return true if rectangle covers the shape, false otherwise
	 */
	boolean coveredBy(Rectangle rectangle);

	/**
	 * Computes the convex hull of a given shape
	 *
	 * @return List of {@link Point2D} objects that determine the convex hull of the given set of points
	 */
	List<Point2D> convexHull();

	/**
	 * Computes the area covered by a <b>simple</b> polygon determined by the
	 * given points if they are traversed in their initial order.
	 *
	 * Assumes that the polygon is simple, does not check this.
	 *
	 * @return Area covered by polygon determined by points
	 */
	double area();
}
