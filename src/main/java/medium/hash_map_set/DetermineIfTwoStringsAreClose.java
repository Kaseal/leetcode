package medium.hash_map_set;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//1657. Determine if Two Strings Are Close (Medium)
public class DetermineIfTwoStringsAreClose {

	public boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		HashMap<Character, Long> hm1 = word1.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));

		HashMap<Character, Long> hm2 = word2.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));

		if (hm1.size() != hm2.size()) {
			return false;
		}

		for (Map.Entry<Character, Long> entry : hm1.entrySet()) {
			if (!hm2.containsKey(entry.getKey())) {
				return false;
			}
		}

		String str1 = hm1.values().stream().sorted().map(String::valueOf).collect(Collectors.joining());
		String str2 = hm2.values().stream().sorted().map(String::valueOf).collect(Collectors.joining());

		return str1.equals(str2);
	}

}
