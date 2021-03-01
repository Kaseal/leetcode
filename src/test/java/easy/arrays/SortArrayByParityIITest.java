package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityIITest {

	private final SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();

	@Test
	public void test4257() {
		Assert.assertArrayEquals(new int[]{4, 5, 2, 7}, sortArrayByParityII.sortArrayByParityII(new int[]{4, 2, 5, 7}));
	}

	@Test
	public void test23() {
		Assert.assertArrayEquals(new int[]{2, 3}, sortArrayByParityII.sortArrayByParityII(new int[]{2, 3}));
	}

	@Test
	public void test34() {
		Assert.assertArrayEquals(new int[]{4, 3}, sortArrayByParityII.sortArrayByParityII(new int[]{3, 4}));
	}

}