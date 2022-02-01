package easy.bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

	private final SingleNumber singleNumber = new SingleNumber();

	@Test
	public void test1() {
		Assertions.assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(1, singleNumber.singleNumber(new int[]{1}));
	}

}