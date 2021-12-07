package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

	private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

	@Test
	public void test715364() {
		Assertions.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
	}

	@Test
	public void test76431() {
		Assertions.assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
	}

	@Test
	public void test2121012() {
		Assertions.assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
	}

}