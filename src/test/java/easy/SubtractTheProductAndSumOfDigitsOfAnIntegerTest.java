package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

	private final SubtractTheProductAndSumOfDigitsOfAnInteger instance = new SubtractTheProductAndSumOfDigitsOfAnInteger();

	@Test
	public void test234() {
		Assertions.assertEquals(15, instance.subtractProductAndSum(234));
	}

	@Test
	public void test4421() {
		Assertions.assertEquals(21, instance.subtractProductAndSum(4421));
	}

}