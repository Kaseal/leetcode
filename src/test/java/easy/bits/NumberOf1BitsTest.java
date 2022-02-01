package easy.bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOf1BitsTest {

	private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

	@Test
	public void test1() {
		Assertions.assertEquals(3, numberOf1Bits.hammingWeight(11));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(1, numberOf1Bits.hammingWeight(64));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(31, numberOf1Bits.hammingWeight(-3));
	}

}