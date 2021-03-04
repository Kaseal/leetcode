package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1560. Most Visited Sector in a Circular Track (Easy)
public class MostVisitedSectorInACircularTrack {

	public List<Integer> mostVisited(int n, int[] rounds) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			hm.put(i, 0);
		}

		for (int i = 0; i < rounds.length - 1; i++) {
			int s = rounds[i];
			int e = rounds[i + 1];

			if (i > 0) {
				if (s + 1 > n) {
					s = 1;
				} else {
					s++;
				}
			}

			while (s != e) {
				hm.put(s, hm.get(s) + 1);
				if (s + 1 > n) {
					s = 1;
				} else {
					s++;
				}
			}
			hm.put(s, hm.get(s) + 1);

		}

		int max = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer value = entry.getValue();
			if (value > max) {
				max = value;
			}
		}

		List<Integer> res = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			Integer value = entry.getValue();
			if (value == max) {
				res.add(entry.getKey());
			}
		}

		return res;
	}

}
