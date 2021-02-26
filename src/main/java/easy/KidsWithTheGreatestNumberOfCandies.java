package easy;

import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies (Easy)
public class KidsWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = candies.length > 0 ? candies[0] : 0;

		for (int i = 1; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}

		List<Boolean> list = new ArrayList<>();

		for (int candy : candies) {
			if (candy + extraCandies >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}

		return list;
	}

}
