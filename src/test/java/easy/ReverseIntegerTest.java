package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

	private final ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	public void test123() {
		Assertions.assertEquals(321, reverseInteger.reverse(123));
	}

	@Test
	public void testMinus_123() {
		Assertions.assertEquals(-321, reverseInteger.reverse(-123));
	}

	@Test
	public void test120() {
		Assertions.assertEquals(21, reverseInteger.reverse(120));
	}

	@Test
	public void test0() {
		Assertions.assertEquals(0, reverseInteger.reverse(0));
	}

}