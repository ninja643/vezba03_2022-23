package rs.ac.ni.pmf.oop2.geometry;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PointsParser
{
	private final ObjectMapper _objectMapper = new ObjectMapper();

	public PointsParser()
	{
		// initialize objectMapper
	}

	public Point2D parseSinglePoint(final String input) throws JsonProcessingException
	{
		return _objectMapper.readValue(input, Point2D.class);
	}

	public List<Point2D> parsePoints(final String input) throws JsonProcessingException
	{
		//				return _objectMapper.readValue(input, List.class);
		return _objectMapper.readValue(input, new TypeReference<>()
		{
		});
	}

	public String pointToJson(final Point2D point2D) throws JsonProcessingException
	{
		return _objectMapper.writeValueAsString(point2D);
	}

	public String pointsToJson(final List<Point2D> points) throws JsonProcessingException
	{
		return _objectMapper.writeValueAsString(points);
	}
}
