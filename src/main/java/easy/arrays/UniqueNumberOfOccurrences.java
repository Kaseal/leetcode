package easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

//1207. Unique Number of Occurrences (Easy)
public class UniqueNumberOfOccurrences {

	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Long> grouped = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(n -> n, HashMap::new, Collectors.counting()));

		return grouped.values().stream().distinct().count() == grouped.size();
	}

}
