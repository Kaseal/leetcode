package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

	private final NumberOfStepsToReduceANumberToZero instance = new NumberOfStepsToReduceANumberToZero();

	@Test
	public void test14() {
		Assertions.assertEquals(6, instance.numberOfSteps(14));
	}

	@Test
	public void test8() {
		Assertions.assertEquals(4, instance.numberOfSteps(8));
	}

	@Test
	public void test123() {
		Assertions.assertEquals(12, instance.numberOfSteps(123));
	}

}