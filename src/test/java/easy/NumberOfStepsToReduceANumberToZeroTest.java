package easy;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

	private final NumberOfStepsToReduceANumberToZero instance = new NumberOfStepsToReduceANumberToZero();

	@Test
	public void test14() {
		Assert.assertEquals(6, instance.numberOfSteps(14));
	}

	@Test
	public void test8() {
		Assert.assertEquals(4, instance.numberOfSteps(8));
	}

	@Test
	public void test123() {
		Assert.assertEquals(12, instance.numberOfSteps(123));
	}

}