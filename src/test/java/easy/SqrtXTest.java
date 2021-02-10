package easy;

import org.junit.Assert;
import org.junit.Test;

public class SqrtXTest {

	private final SqrtX sqrtX = new SqrtX();

	@Test
	public void test4() {
		Assert.assertEquals(2, sqrtX.mySqrt(4));
	}

	@Test
	public void test8() {
		Assert.assertEquals(2, sqrtX.mySqrt(8));
	}

	@Test
	public void test2147395600() {
		Assert.assertEquals(46340, sqrtX.mySqrt(2147395600));
	}

	@Test
	public void test100() {
		Assert.assertEquals(10, sqrtX.mySqrt(100));
	}

	@Test
	public void test6() {
		Assert.assertEquals(2, sqrtX.mySqrt(6));
	}

}