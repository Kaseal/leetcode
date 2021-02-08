package easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

	private final ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	public void test123() {
		Assert.assertEquals(321, reverseInteger.reverse(123));
	}

	@Test
	public void testMinus_123() {
		Assert.assertEquals(-321, reverseInteger.reverse(-123));
	}

	@Test
	public void test120() {
		Assert.assertEquals(21, reverseInteger.reverse(120));
	}

	@Test
	public void test0() {
		Assert.assertEquals(0, reverseInteger.reverse(0));
	}

}