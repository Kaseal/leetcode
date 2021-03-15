package easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

	private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

	@Test
	public void test715364() {
		Assert.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
	}

	@Test
	public void test76431() {
		Assert.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
	}

	@Test
	public void test2121012() {
		Assert.assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
	}

}