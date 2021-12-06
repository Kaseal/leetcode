package medium.strings;

import java.util.HashMap;

//567. Permutation in String (Medium)
public class PermutationInString {

	public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return false;
		}

		HashMap<Character, Integer> s1Hm = new HashMap<>();
		HashMap<Character, Integer> s2Hm = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			increment(s1Hm, s1.charAt(i));
			increment(s2Hm, s2.charAt(i));
		}

		for (int i = 0; i < s2.length() - s1.length(); i++) {
			if (areEqual(s1Hm, s2Hm)) {
				return true;
			}
			decrement(s2Hm, s2.charAt(i));
			increment(s2Hm, s2.charAt(i + s1.length()));
		}

		return areEqual(s1Hm, s2Hm);
	}

	private boolean areEqual(HashMap<Character, Integer> first, HashMap<Character, Integer> second) {
		if (first.size() != second.size()) {
			return false;
		}

		return first.entrySet().stream()
				.allMatch(e -> e.getValue().equals(second.get(e.getKey())));
	}

	private void increment(HashMap<Character, Integer> hm, Character c) {
		Integer value = hm.get(c);

		if (value == null) {
			hm.put(c, 1);
		} else {
			hm.put(c, ++value);
		}
	}

	private void decrement(HashMap<Character, Integer> hm, Character c) {
		Integer value = hm.get(c);

		if (value != null) {
			value--;
			if (value == 0) {
				hm.remove(c);
			} else {
				hm.put(c, value);
			}
		}
	}

}
