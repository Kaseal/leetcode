package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class XOROperationInAnArrayTest {

	private final XOROperationInAnArray instance = new XOROperationInAnArray();

	@Test
	public void test5_0() {
		Assert.assertEquals(8, instance.xorOperation(5, 0));
	}

	@Test
	public void test4_3() {
		Assert.assertEquals(8, instance.xorOperation(4, 3));
	}

	@Test
	public void test1_7() {
		Assert.assertEquals(7, instance.xorOperation(1, 7));
	}

	@Test
	public void test10_5() {
		Assert.assertEquals(2, instance.xorOperation(10, 5));
	}

}