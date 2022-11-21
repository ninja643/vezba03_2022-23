package rs.ac.ni.pmf.oop2.initializers;

public class InitializerBad
{
	static
	{
		initialize();
	}

	private static boolean isInitialized = false;

	private static int sum;

	public static int getSum()
	{
		initialize();
		return sum;
	}

	private static void initialize()
	{
		if (!isInitialized)
		{
			for (int i = 0; i < 100; i++)
			{
				sum += i;
			}
			isInitialized = true;
		}
	}
}
