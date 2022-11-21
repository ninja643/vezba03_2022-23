package rs.ac.ni.pmf.oop2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import rs.ac.ni.pmf.oop2.initializers.InitializerBad;

class InitializerBadTest
{
	@Test
	public void shouldConfirmIncorrectResult()
	{
		assertThat(InitializerBad.getSum()).isNotEqualTo(4950);
	}

	@Test
	public void shouldConfirmThatComputedSumIsAlwaysTheSame()
	{
		final int sum1 = InitializerBad.getSum();
		final int sum2 = InitializerBad.getSum();

		assertThat(sum1).isEqualTo(sum2);
	}
}
