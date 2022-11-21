package rs.ac.ni.pmf.oop2.initializers;

public class Chicken
{
	private Integer eggs = 2;

	static
	{
		System.out.println("Going through static initialization block");
	}

	{
		System.out.println("Going through common instance initialization block");
		this.eggs = 3;
	}

	public Chicken()
	{
		System.out.println("Zero args constructor");
	}

	public Chicken(int eggs)
	{
		System.out.println("One argument constructor");
		this.eggs = eggs;
	}

	public static void main(String[] args)
	{
		var c1 = new Chicken(1);
		var c2 = new Chicken(2);
		var c3 = new Chicken(3);
		var c4 = new Chicken();

		c1.eggs = c2.eggs;
		c2 = c1;
		c3.eggs = null;

	}
}
