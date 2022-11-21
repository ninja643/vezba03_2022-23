package rs.ac.ni.pmf.oop2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import rs.ac.ni.pmf.oop2.initializers.InitializerGood;

public class InitializerGoodTest
{
	@Test
	public void shouldConfirmCorrectResult()
	{
		assertThat(InitializerGood.getSum()).isEqualTo(4950);
	}

	@Test
	public void shouldConfirmThatComputedSumIsAlwaysTheSame()
	{
		final int sum1 = InitializerGood.getSum();
		final int sum2 = InitializerGood.getSum();

		assertThat(sum1).isEqualTo(sum2);
	}
}
