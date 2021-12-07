package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtXTest {

	private final SqrtX sqrtX = new SqrtX();

	@Test
	public void test4() {
		Assertions.assertEquals(2, sqrtX.mySqrt(4));
	}

	@Test
	public void test8() {
		Assertions.assertEquals(2, sqrtX.mySqrt(8));
	}

	@Test
	public void test2147395600() {
		Assertions.assertEquals(46340, sqrtX.mySqrt(2147395600));
	}

	@Test
	public void test100() {
		Assertions.assertEquals(10, sqrtX.mySqrt(100));
	}

	@Test
	public void test6() {
		Assertions.assertEquals(2, sqrtX.mySqrt(6));
	}

}