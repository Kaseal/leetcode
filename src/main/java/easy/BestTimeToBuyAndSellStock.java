package easy;

//121. Best Time to Buy and Sell Stock (Easy)
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}

		int buy = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > buy) {
				if (profit < prices[i] - buy) {
					profit = prices[i] - buy;
				}
			} else {
				buy = prices[i];
			}
		}

		return profit;
	}

}
