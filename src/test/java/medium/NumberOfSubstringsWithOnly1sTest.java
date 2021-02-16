package medium;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubstringsWithOnly1sTest {

	private final NumberOfSubstringsWithOnly1s numberOfSubstringsWithOnly1s = new NumberOfSubstringsWithOnly1s();

	@Test
	public void test0110111() {
		Assert.assertEquals(9, numberOfSubstringsWithOnly1s.numSub("0110111"));
	}

	@Test
	public void test101() {
		Assert.assertEquals(2, numberOfSubstringsWithOnly1s.numSub("101"));
	}

	@Test
	public void test111111() {
		Assert.assertEquals(21, numberOfSubstringsWithOnly1s.numSub("111111"));
	}

	@Test
	public void test000() {
		Assert.assertEquals(0, numberOfSubstringsWithOnly1s.numSub("000"));
	}

}