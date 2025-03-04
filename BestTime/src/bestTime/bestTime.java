package bestTime;

public class bestTime {
	public int[] sell(int[] prices) {
		int minPrice = 0;
		int j = 0;
		minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
				j = i;

			}
		}
		return new int[] { j, minPrice };

	}

	public int buy(int[] prices, int j) {
		int maxPrice = 0;
		maxPrice = prices[j];
		if (j == prices.length - 1) {
			return 0;
		} else {
			for (int i = j; i < prices.length; i++) {
				if (prices[i] > maxPrice) {
					maxPrice = prices[i];
				}
			}
			return maxPrice;
		}
		


	}

	public int profit(int[] prices) {
		int[] sellP = sell(prices);
		int minPrice = sellP[1];

		int maxPrice = buy(prices, sellP[0]);

		if (maxPrice == minPrice) {
			return 0;
		} else if (maxPrice < minPrice) {
			return 0;
		} else {
			return maxPrice-minPrice;
		}

	}
}
