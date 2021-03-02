package easy;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

	private final SubtractTheProductAndSumOfDigitsOfAnInteger instance = new SubtractTheProductAndSumOfDigitsOfAnInteger();

	@Test
	public void test234() {
		Assert.assertEquals(15, instance.subtractProductAndSum(234));
	}

	@Test
	public void test4421() {
		Assert.assertEquals(21, instance.subtractProductAndSum(4421));
	}

}