package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XOROperationInAnArrayTest {

	private final XOROperationInAnArray instance = new XOROperationInAnArray();

	@Test
	public void test5_0() {
		Assertions.assertEquals(8, instance.xorOperation(5, 0));
	}

	@Test
	public void test4_3() {
		Assertions.assertEquals(8, instance.xorOperation(4, 3));
	}

	@Test
	public void test1_7() {
		Assertions.assertEquals(7, instance.xorOperation(1, 7));
	}

	@Test
	public void test10_5() {
		Assertions.assertEquals(2, instance.xorOperation(10, 5));
	}

}