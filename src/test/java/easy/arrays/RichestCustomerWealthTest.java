package easy.arrays;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {

	private final RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

	@Test
	public void test123_321() {
		int[][] nums = {{1, 2, 3}, {3, 2, 1}};

		Assert.assertEquals(6, richestCustomerWealth.maximumWealth(nums));
	}

	@Test
	public void test15_73_35() {
		int[][] nums = {{1, 5}, {7, 3}, {3, 5}};

		Assert.assertEquals(10, richestCustomerWealth.maximumWealth(nums));
	}

	@Test
	public void test287_713_195() {
		int[][] nums = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

		Assert.assertEquals(17, richestCustomerWealth.maximumWealth(nums));
	}

}