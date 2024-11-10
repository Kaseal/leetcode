package medium.hash_map_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//2352. Equal Row and Column Pairs (Medium)
public class EqualRowAndColumnPairs {

	public int equalPairs(int[][] grid) {
		int count = 0;
		int hash;

		List<Integer> rows = new ArrayList<>();
		for (int[] ints : grid) {
			hash = 0;
			for (int i : ints) {
				hash = Objects.hash(hash, i, ".");
			}
			rows.add(hash);
		}

		HashMap<Integer, Long> rowsUnique = rows.stream()
				.collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));

		for (int i = 0; i < grid.length; i++) {
			hash = 0;
			for (int j = 0; j < grid[i].length; j++) {
				hash = Objects.hash(hash, grid[j][i], ".");
			}

			if (rowsUnique.containsKey(hash)) {
				count += rowsUnique.get(hash).intValue();
			}
		}

		return count;
	}

}
