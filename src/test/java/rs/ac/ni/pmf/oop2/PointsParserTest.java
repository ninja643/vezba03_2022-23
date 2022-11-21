package rs.ac.ni.pmf.oop2;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import rs.ac.ni.pmf.oop2.geometry.Point2D;
import rs.ac.ni.pmf.oop2.geometry.PointsParser;

class PointsParserTest
{
	private final PointsParser _pointsParser = new PointsParser();

	@Test
	public void shouldParseSinglePoint() throws JsonProcessingException
	{
		final Point2D point2D = _pointsParser.parseSinglePoint("{\"x\": 3, \"y\": 2}");
		assertThat(point2D.getX()).isEqualTo(3);
		assertThat(point2D.getY()).isEqualTo(2);
	}

	@Test
	public void shouldParseListOfPoints() throws JsonProcessingException
	{
		final List<Point2D> points = _pointsParser.parsePoints("[{\"x\": 1, \"y\": 1}, {\"x\": 2, \"y\": 2}]");
		assertThat(points).hasSize(2);
		System.out.println(_pointsParser.pointsToJson(points));
	}
}
