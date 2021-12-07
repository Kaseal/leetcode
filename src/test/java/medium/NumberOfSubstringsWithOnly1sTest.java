package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubstringsWithOnly1sTest {

	private final NumberOfSubstringsWithOnly1s numberOfSubstringsWithOnly1s = new NumberOfSubstringsWithOnly1s();

	@Test
	public void test0110111() {
		Assertions.assertEquals(9, numberOfSubstringsWithOnly1s.numSub("0110111"));
	}

	@Test
	public void test101() {
		Assertions.assertEquals(2, numberOfSubstringsWithOnly1s.numSub("101"));
	}

	@Test
	public void test111111() {
		Assertions.assertEquals(21, numberOfSubstringsWithOnly1s.numSub("111111"));
	}

	@Test
	public void test000() {
		Assertions.assertEquals(0, numberOfSubstringsWithOnly1s.numSub("000"));
	}

}